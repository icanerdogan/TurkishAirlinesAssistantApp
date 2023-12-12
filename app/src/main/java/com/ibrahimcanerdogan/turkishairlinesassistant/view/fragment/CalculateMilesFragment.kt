package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentCalculateMilesBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.FlightMilesRequestDetail
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.CalculateFlightRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.FlightMilesRequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.calculateFlightToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.calculateFlightFromJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class CalculateMilesFragment : Fragment() {

    private var _binding: FragmentCalculateMilesBinding? = null
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
        _binding = FragmentCalculateMilesBinding.inflate(inflater, container, false)
        return binding.root
     }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.calculateFlightMiles(
            CalculateFlightRequest(
                FlightMilesRequestDetail(
                    flightMilesDetailCardType = "CC",
                    flightMilesDetailClassCode = "H",
                    flightMilesDetailDestination = "ADS",
                    flightMilesDetailFlightDate = "19.12.2023",
                    flightMilesDetailOrigin = "IST"
                ),
                FlightMilesRequestHeader()
            ).calculateFlightToJsonObject()
        )

        viewModel.flightMilesData.observe(viewLifecycleOwner) {
            println(it.calculateFlightFromJsonObject().flightMilesResponseMessage)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}