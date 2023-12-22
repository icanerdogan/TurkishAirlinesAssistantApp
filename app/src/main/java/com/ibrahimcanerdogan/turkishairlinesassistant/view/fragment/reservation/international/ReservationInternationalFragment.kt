package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.reservation.international

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.R
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentReservationInternationalBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.ReservationInternationalOTARequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.ReservationInternationalRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.ReservationInternationalRequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.reservationInternationalToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response.ReservationResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.reservation.ReservationBottomSheet
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.reservation.ReservationViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.reservation.ReservationViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ReservationInternationalFragment : Fragment() {

    private var _binding: FragmentReservationInternationalBinding? = null
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
        _binding = FragmentReservationInternationalBinding.inflate(inflater, container, false)

        handleObserve()

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        with(binding) {
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

            buttonReservationInternational.setOnClickListener {
                viewModel.getReservationDetailData(ReservationInternationalRequest(
                    requestHeader = ReservationInternationalRequestHeader(
                        requestHeaderAirlineCode = airlinesCode
                    ),
                    reservationInternationalOTARequest = ReservationInternationalOTARequest(
                        otaRequestUniqueId = binding.editTextReservationID.text.toString().uppercase(),
                        otaRequestSurname = binding.editTextReservationSurname.text.toString().uppercase()
                    )
                ).reservationInternationalToJsonObject())
            }
        }
    }

    private fun handleObserve() {
        viewModel.reservationData.observe(viewLifecycleOwner, ::getInternationalReservation)
    }


    private fun getInternationalReservation(reservationResponse: ReservationResponse?) {
        reservationResponse?.let {
            val modalBottomSheet = ReservationBottomSheet.newInstance(it)
            modalBottomSheet.show(childFragmentManager, ReservationBottomSheet.TAG)
            Log.i(TAG, it.message.description)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "ReservationInternationalFragment"
    }
}