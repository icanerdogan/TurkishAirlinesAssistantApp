package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.calculate

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
import com.ibrahimcanerdogan.turkishairlinesassistant.R
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentCalculateBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.FlightMilesRequestDetail
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.CalculateFlightRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.FlightMilesRequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.calculateFlightToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.CalculateViewPagerAdapter
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CalculateFragment : Fragment() {

    private var _binding: FragmentCalculateBinding? = null
    private val binding get() = _binding!!

    private val viewModel by lazy {
        ViewModelProvider(this, factory).get(CalculateViewModel::class.java)
    }

    @Inject
    lateinit var factory: CalculateViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCalculateBinding.inflate(inflater, container, false)

        binding.apply {
            viewPager.adapter = CalculateViewPagerAdapter(requireActivity())
            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                when(position) {
                    0 -> {
                        tab.text = "Flight Miles"
                    }
                    1 -> tab.text = "Award Miles"
                }
            }.attach()
        }
        return binding.root
     }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}