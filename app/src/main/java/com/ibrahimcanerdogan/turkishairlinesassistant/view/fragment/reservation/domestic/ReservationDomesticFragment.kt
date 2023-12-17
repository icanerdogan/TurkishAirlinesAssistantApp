package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.reservation.domestic

import android.os.Bundle
import android.text.InputType
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.R
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentReservationDomesticBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.ReservationInternationalOTARequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.ReservationInternationalRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.ReservationInternationalRequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.reservationInternationalToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.websdom.ReservationWebsdomOTARequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.websdom.ReservationWebsdomRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.websdom.ReservationWebsdomRequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.websdom.reservationWebsdomToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response.ReservationResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.reservation.ReservationViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.reservation.ReservationViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ReservationDomesticFragment : Fragment() {

    private var _binding: FragmentReservationDomesticBinding? = null
    private val binding get() = _binding!!

    private val viewModel by lazy {
        ViewModelProvider(this, factory).get(ReservationViewModel::class.java)
    }

    @Inject
    lateinit var factory: ReservationViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentReservationDomesticBinding.inflate(inflater, container, false)

        handleObserve()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        binding.apply {
            var airlinesCode = "TK"

            radioButtonTurkishAirlines.setOnCheckedChangeListener { _, checkedId ->
                if(checkedId) {
                    airlinesCode = "TK"
                    radioButtonAJet.isChecked = false
                }
            }
            radioButtonAJet.setOnCheckedChangeListener { _, checkedId ->
                if(checkedId) {
                    airlinesCode = "AJ"
                    radioButtonTurkishAirlines.isChecked = false
                }
            }

            buttonReservationDomestic.setOnClickListener {
                viewModel.getReservationDetailData(ReservationWebsdomRequest(
                    requestHeader = ReservationWebsdomRequestHeader(
                        requestHeaderAirlineCode = airlinesCode
                    ),
                    reservationWebsdomOTARequest = ReservationWebsdomOTARequest(
                        otaRequestUniqueId = binding.editTextReservationID.text.toString().uppercase(),
                        otaRequestGivenName = binding.editTextReservationName.text.toString().uppercase(),
                        otaRequestSurname = binding.editTextReservationSurname.text.toString().uppercase()
                    )
                ).reservationWebsdomToJsonObject())
            }
        }

    }

    private fun handleObserve() {
        viewModel.reservationData.observe(viewLifecycleOwner, ::getDomesticReservation)
    }

    private fun getDomesticReservation(reservationResponse: ReservationResponse?) {
        if (reservationResponse == null) Toast.makeText(requireContext(), "null", Toast.LENGTH_LONG).show()

        reservationResponse?.let {
            println(it.message)
            Toast.makeText(requireContext(), it.message.description, Toast.LENGTH_LONG).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "ReservationDomesticFragment"
    }
}