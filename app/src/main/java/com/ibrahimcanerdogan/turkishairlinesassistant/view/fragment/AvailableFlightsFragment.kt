package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentAvailableBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request.AvailableFlightsDomesticRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request.CabinPreference
import com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request.DepartureDateTime
import com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request.DestinationLocation
import com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request.OriginDestinationInformation
import com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request.OriginLocation
import com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request.PassengerTypeQuantity
import com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request.RequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request.availableFlightsDomesticRequestToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response.availableFlightsDomesticResponseFromJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.available.AvailableFlightsViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.available.AvailableFlightsViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class AvailableFlightsFragment : Fragment() {

    private var _binding: FragmentAvailableBinding? = null
    private val binding get() = _binding!!

    private val viewModel by lazy {
        ViewModelProvider(this, factory).get(AvailableFlightsViewModel::class.java)
    }

    @Inject
    lateinit var factory: AvailableFlightsViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAvailableBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getAvailableFlights(
            AvailableFlightsDomesticRequest(
                requestHeader = RequestHeader(),
                ReducedDataIndicator = false,
                RoutingType = "R",
                TargetSource = "BrandedFares",
                PassengerTypeQuantity = listOf(
                    PassengerTypeQuantity("adult", 1),
                    PassengerTypeQuantity("child", 1),
                    PassengerTypeQuantity("infant", 0)
                ),
                OriginDestinationInformation = listOf(
                    OriginDestinationInformation(
                        DepartureDateTime = DepartureDateTime(
                            WindowAfter = "P0D",
                            WindowBefore = "P0D",
                            Date = "14JAN"
                        ),
                        OriginLocation = OriginLocation(
                            LocationCode = "IST",
                            MultiAirportCityInd = false
                        ),
                        DestinationLocation = DestinationLocation(
                            LocationCode = "ESB",
                            MultiAirportCityInd = false
                        ),
                        CabinPreferences = listOf(
                            CabinPreference(Cabin = "ECONOMY"),
                            CabinPreference(Cabin = "BUSINESS")
                        )
                    ),
                    OriginDestinationInformation(
                        DepartureDateTime = DepartureDateTime(
                            WindowAfter = "P0D",
                            WindowBefore = "P0D",
                            Date = "19JAN"
                        ),
                        OriginLocation = OriginLocation(
                            LocationCode = "ESB",
                            MultiAirportCityInd = false
                        ),
                        DestinationLocation = DestinationLocation(
                            LocationCode = "IST",
                            MultiAirportCityInd = false
                        ),
                        CabinPreferences = listOf(
                            CabinPreference(Cabin = "ECONOMY"),
                            CabinPreference(Cabin = "BUSINESS")
                        )
                    )
                )

            ).availableFlightsDomesticRequestToJsonObject()
        )

        viewModel.availableFlightsData.observe(viewLifecycleOwner) {
            println(it.availableFlightsDomesticResponseFromJsonObject().message)
            Toast.makeText(requireContext(), it.availableFlightsDomesticResponseFromJsonObject().message.description, Toast.LENGTH_LONG).show()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}