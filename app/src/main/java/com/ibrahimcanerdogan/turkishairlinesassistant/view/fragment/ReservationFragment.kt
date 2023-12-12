package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentReservationBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.ReservationInternationalRequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.ReservationInternationalRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.ReservationInternationalOTARequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.reservationInternationalToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response.reservationFromJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.reservation.ReservationViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.reservation.ReservationViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ReservationFragment : Fragment() {

    private var _binding: FragmentReservationBinding? = null
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
        _binding = FragmentReservationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getReservationDetailData(ReservationInternationalRequest(
            requestHeader = ReservationInternationalRequestHeader(
                requestHeaderAirlineCode = "TK"
            ),
            reservationInternationalOTARequest = ReservationInternationalOTARequest(
                otaRequestUniqueId = "TT8VN8",
                otaRequestSurname = "CELIKTAS"
            )
        ).reservationInternationalToJsonObject())

        viewModel.reservationData.observe(viewLifecycleOwner) {
            if (!it.isNullOrEmpty()) println(it.reservationFromJsonObject().message.description)
            else Log.e(TAG, "reservationData is empty.")
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "ReservationFragment"
    }
}