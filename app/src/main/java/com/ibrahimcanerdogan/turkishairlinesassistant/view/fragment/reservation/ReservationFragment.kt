package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.reservation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentReservationBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.ReservationInternationalRequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.ReservationInternationalRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.ReservationInternationalOTARequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international.reservationInternationalToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.reservation.ReservationViewPagerAdapter
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

        binding.apply {
            viewPager.adapter = ReservationViewPagerAdapter(requireActivity())
            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                when(position) {
                    0 -> {
                        tab.text = "Domestic Flights"
                    }
                    1 -> tab.text = "International Flights"
                }
            }.attach()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "ReservationFragment"
    }
}