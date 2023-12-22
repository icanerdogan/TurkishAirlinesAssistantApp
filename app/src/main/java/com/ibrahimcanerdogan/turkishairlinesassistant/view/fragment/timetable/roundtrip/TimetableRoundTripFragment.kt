package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.timetable.roundtrip

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointForward
import com.google.android.material.datepicker.MaterialDatePicker
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentTimetableRoundTripBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.DepartureDateTime
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.DestinationLocation
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.FlightTypePref
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.OTAAirScheduleRQ
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.OriginDestinationInformation
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.OriginLocation
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.RequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.roundtrip.TimetableRoundTripRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request.roundtrip.timetableRoundTripRequestToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip.TimetableRoundTripResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.util.AppConstant
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModelFactory
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable.TimetableViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable.TimetableViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone
import javax.inject.Inject

@AndroidEntryPoint
class TimetableRoundTripFragment : Fragment() {

    private var _binding: FragmentTimetableRoundTripBinding? = null
    private val binding get() = _binding!!

    private val timetableViewModel by lazy {
        ViewModelProvider(this, timetableFactory).get(TimetableViewModel::class.java)
    }

    private val calculateViewModel by lazy {
        ViewModelProvider(this, calculateFactory).get(CalculateViewModel::class.java)
    }

    @Inject
    lateinit var calculateFactory: CalculateViewModelFactory

    @Inject
    lateinit var timetableFactory: TimetableViewModelFactory

    private var formattedDepartureDate = AppConstant.getFormattedTodayDate()
    private var formattedReturnDate = AppConstant.getFormattedTomorrowDate()

    private var isMultiAirportCity : Boolean = true
    private var scheduleType = "D"

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTimetableRoundTripBinding.inflate(inflater, container, false)

        timetableViewModel.timetableRoundTripData.observe(viewLifecycleOwner, ::observeTimetableRoundTrip)

        AppConstant.flightTextWatcher(binding.editTextOrigin)
        AppConstant.flightTextWatcher(binding.editTextDestination)

        calculateViewModel.getAirportsList()
        calculateViewModel.airportListData.observe(viewLifecycleOwner) {
            with(binding) {
                editTextOrigin.setSimpleItems(it)
                editTextDestination.setSimpleItems(it)
            }
        }

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            setDepartureTime()
            setReturnTime()
            getSelectedMultiAirportCity()
            getSelectedScheduleType()

            buttonTimetableRoundTrip.setOnClickListener {
                timetableViewModel.getTimetableRoundTripDetails(
                    TimetableRoundTripRequest(
                        requestHeader = RequestHeader(),
                        OTA_AirScheduleRQ = OTAAirScheduleRQ(
                            FlightTypePref = FlightTypePref(DirectAndNonStopOnlyInd = false),
                            OriginDestinationInformation = OriginDestinationInformation(
                                DepartureDateTime(WindowAfter = "P3D", WindowBefore= "P3D", Date = formattedDepartureDate),
                                DestinationLocation(LocationCode = editTextDestination.text.toString(), MultiAirportCityInd = isMultiAirportCity),
                                OriginLocation(LocationCode= editTextOrigin.text.toString(), MultiAirportCityInd = isMultiAirportCity)
                            )
                        ),
                        returnDate = formattedReturnDate,
                        scheduleType = scheduleType,
                        tripType = "R"
                    ).timetableRoundTripRequestToJsonObject()
                )
            }
        }
    }

    private fun observeTimetableRoundTrip(timetableResponse: TimetableRoundTripResponse?) {
        if (timetableResponse == null) return

        try {
            val timetableOneWayBottomSheet = TimetableRoundTripBottomSheet.newInstance(timetableResponse)
            timetableOneWayBottomSheet.show(childFragmentManager, TimetableRoundTripBottomSheet.TAG)
            Log.i(TAG, timetableResponse.message.description)
        } catch (e: Exception) {
            Toast.makeText(requireContext(),
                "An error has occurred, our teams will investigate the problem.",
                Toast.LENGTH_SHORT
            ).show()

            Log.e(TAG, e.message.toString())
        }
    }

    private fun FragmentTimetableRoundTripBinding.getSelectedScheduleType() {
        radioButtonDaily.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                scheduleType = "D"
                radioButtonWeekly.isChecked = false
                radioButtonMonthly.isChecked = false
            }
        }
        radioButtonWeekly.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                scheduleType = "W"
                radioButtonDaily.isChecked = false
                radioButtonMonthly.isChecked = false
            }
        }
        radioButtonMonthly.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                scheduleType = "M"
                radioButtonDaily.isChecked = false
                radioButtonWeekly.isChecked = false
            }
        }
    }

    private fun FragmentTimetableRoundTripBinding.getSelectedMultiAirportCity(): Boolean {
        radioButtonMultiAirportYes.setOnCheckedChangeListener { _, checkedId ->
            if (checkedId) {
                isMultiAirportCity = true
                radioButtonMultiAirportNo.isChecked = false
            }
        }
        radioButtonMultiAirportNo.setOnCheckedChangeListener { _, checkedId ->
            if (checkedId) {
                isMultiAirportCity = false
                radioButtonMultiAirportYes.isChecked = false
            }
        }
        return isMultiAirportCity
    }

    private fun FragmentTimetableRoundTripBinding.setDepartureTime() {
        textViewDepartureDate.text = AppConstant.getTodayDate()

        val constraintsBuilder = CalendarConstraints.Builder()
            .setValidator(DateValidatorPointForward.now())


        val datePicker = MaterialDatePicker.Builder.datePicker()
            .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
            .setCalendarConstraints(constraintsBuilder.build())
            .setTitleText("Select Departure Date")
            .build()

        datePicker.addOnPositiveButtonClickListener {
            val timeZoneUTC: TimeZone = TimeZone.getDefault()
            val offsetFromUTC: Int = timeZoneUTC.getOffset(Date().getTime()) * -1
            val simpleFormat = SimpleDateFormat("dd.MM.yyyy", Locale("tr", "TR"))
            val departureFormat = SimpleDateFormat("yyyy-MM-dd", Locale("tr", "TR"))

            val date = Date(it + offsetFromUTC)

            formattedDepartureDate = departureFormat.format(date)
            textViewDepartureDate.text = simpleFormat.format(date)
        }
        linearLayoutDepartureDate.setOnClickListener {
            datePicker.show(parentFragmentManager, TAG)
        }
    }

    private fun FragmentTimetableRoundTripBinding.setReturnTime() {
        textViewReturnDate.text = AppConstant.getTomorrowDate()

        val constraintsBuilder = CalendarConstraints.Builder()
            .setValidator(DateValidatorPointForward.now())


        val datePicker = MaterialDatePicker.Builder.datePicker()
            .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
            .setCalendarConstraints(constraintsBuilder.build())
            .setTitleText("Select Return Date")
            .build()

        datePicker.addOnPositiveButtonClickListener {
            val timeZoneUTC: TimeZone = TimeZone.getDefault()
            val offsetFromUTC: Int = timeZoneUTC.getOffset(Date().getTime()) * -1

            val simpleFormat = SimpleDateFormat("dd.MM.yyyy", Locale("tr", "TR"))
            val returnFormat = SimpleDateFormat("yyyy-MM-dd", Locale("tr", "TR"))

            val date = Date(it + offsetFromUTC)

            formattedReturnDate = returnFormat.format(date)
            textViewReturnDate.text = simpleFormat.format(date)
        }
        linearLayoutReturnDate.setOnClickListener {
            datePicker.show(parentFragmentManager, TAG)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "TimetableRoundTripFragment"
    }
}