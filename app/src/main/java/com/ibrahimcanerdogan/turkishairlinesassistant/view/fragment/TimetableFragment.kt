package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentTimetableBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.DepartureDateTime
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.DestinationLocation
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.FlightTypePref
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.OTAAirScheduleRQ
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.OriginDestinationInformation
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.OriginLocation
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.RequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.TimetableRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.timetableRequestToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable.TimetableViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable.TimetableViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TimetableFragment : Fragment() {

    private var _binding: FragmentTimetableBinding? = null
    private val binding get() = _binding!!

    private val viewModel by lazy {
        ViewModelProvider(this, factory).get(TimetableViewModel::class.java)
    }

    @Inject
    lateinit var factory: TimetableViewModelFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTimetableBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.getTimetableDetails(
            TimetableRequest(
                requestHeader = RequestHeader(),
                OTA_AirScheduleRQ = OTAAirScheduleRQ(
                    FlightTypePref = FlightTypePref(DirectAndNonStopOnlyInd = false),
                    OriginDestinationInformation = OriginDestinationInformation(
                        DepartureDateTime(WindowAfter = "P3D", WindowBefore= "P3D", Date = "2023-12-13"),
                        DestinationLocation(LocationCode = "ESB", MultiAirportCityInd = false),
                        OriginLocation(LocationCode= "IST", MultiAirportCityInd = true)
                    )
                ),
                returnDate = "2023-12-13",
                scheduleType = "W",
                tripType = "R"
            ).timetableRequestToJsonObject()
        )

        viewModel.timetableData.observe(viewLifecycleOwner) {
            it?.let {
                println(it.message)
                Toast.makeText(requireContext(), it.message.description, Toast.LENGTH_LONG).show()
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}