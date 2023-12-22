package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.calculate.flight

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.datepicker.CalendarConstraints
import com.google.android.material.datepicker.DateValidatorPointForward
import com.google.android.material.datepicker.MaterialDatePicker
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentCalculateFlightMilesBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.CalculateFlightRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.FlightMilesRequestDetail
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.FlightMilesRequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.calculateFlightToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.FlightMilesResponseDataDetail
import com.ibrahimcanerdogan.turkishairlinesassistant.util.AppConstant
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale
import java.util.TimeZone
import javax.inject.Inject


@AndroidEntryPoint
class CalculateFlightMilesFragment : Fragment() {

    private var _binding: FragmentCalculateFlightMilesBinding? = null
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
        _binding = FragmentCalculateFlightMilesBinding.inflate(inflater, container, false)
        AppConstant.flightTextWatcher(binding.editTextDestination)
        AppConstant.flightTextWatcher(binding.editTextOrigin)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {

            textViewFlightDate.text = AppConstant.getTodayDate()

            val constraintsBuilder = CalendarConstraints.Builder()
                    .setValidator(DateValidatorPointForward.now())


            val datePicker = MaterialDatePicker.Builder.datePicker()
                    .setSelection(MaterialDatePicker.todayInUtcMilliseconds())
                    .setCalendarConstraints(constraintsBuilder.build())
                    .setTitleText("Select Flight Date")
                    .build()

            datePicker.addOnPositiveButtonClickListener {
                val timeZoneUTC: TimeZone = TimeZone.getDefault()
                val offsetFromUTC: Int = timeZoneUTC.getOffset(Date().getTime()) * -1
                // Create a date format, then a date object with our offset
                val simpleFormat = SimpleDateFormat("dd.MM.yyyy", Locale("tr", "TR"))
                val date = Date(it + offsetFromUTC)

                textViewFlightDate.text = simpleFormat.format(date)
            }
            linearLayoutFlightDate.setOnClickListener {
                datePicker.show(parentFragmentManager, TAG)
            }


            var cardType = "CC"
            radioButtonClassicCard.setOnCheckedChangeListener { _, isChecked ->
                if(isChecked) {
                    cardType = "CC"
                    radioButtonClassicPlusCard.isChecked = false
                    radioButtonEliteCard.isChecked = false
                    radioButtonElitePlusCard.isChecked = false
                }
            }
            radioButtonClassicPlusCard.setOnCheckedChangeListener { _, isChecked ->
                if(isChecked) {
                    cardType = "CP"
                    radioButtonClassicCard.isChecked = false
                    radioButtonEliteCard.isChecked = false
                    radioButtonElitePlusCard.isChecked = false
                }
            }
            radioButtonEliteCard.setOnCheckedChangeListener { _, isChecked ->
                if(isChecked) {
                    cardType = "EC"
                    radioButtonClassicCard.isChecked = false
                    radioButtonClassicPlusCard.isChecked = false
                    radioButtonElitePlusCard.isChecked = false
                }
            }
            radioButtonElitePlusCard.setOnCheckedChangeListener { _, isChecked ->
                if(isChecked) {
                    cardType = "EP"
                    radioButtonClassicCard.isChecked = false
                    radioButtonClassicPlusCard.isChecked = false
                    radioButtonEliteCard.isChecked = false
                }
            }

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

            var isBusiness = false
            switchBusiness.setOnCheckedChangeListener { _, isChecked ->
                isBusiness = isChecked
            }

            viewModel.getAirportsList()
            viewModel.airportListData.observe(viewLifecycleOwner) {
                with(binding) {
                    editTextOrigin.setSimpleItems(it)
                    editTextDestination.setSimpleItems(it)
                }
            }

            buttonCalculateFlightMiles.setOnClickListener {
                Log.i(TAG, "flightMilesDetailOrigin: ${editTextOrigin.text} flightMilesDetailDestination: ${editTextDestination.text} flightMilesDetailCardType: $cardType")

                val requestData = CalculateFlightRequest(
                    FlightMilesRequestDetail(
                        flightMilesDetailOrigin = editTextOrigin.text.toString(),
                        flightMilesDetailDestination = editTextDestination.text.toString(),
                        flightMilesDetailCardType = cardType,
                        flightMilesDetailFlightDate = textViewFlightDate.text.toString(),
                    ),
                    FlightMilesRequestHeader(
                        flightMilesAirlineCode = airlinesCode
                    )
                ).calculateFlightToJsonObject()

                if (isBusiness) viewModel.calculateBusinessFlightMilesData(requestData)
                else viewModel.calculateEconomyFlightMilesData(requestData)

            }

            viewModel.flightMilesBusinessData.observe(viewLifecycleOwner, ::setBusinessData)
            viewModel.flightMilesEconomyData.observe(viewLifecycleOwner, ::setEconomyData)

        }
    }

    private fun setEconomyData(data: ArrayList<FlightMilesResponseDataDetail>?) {
        data?.let {
            val modalBottomSheet = CalculateFlightMilesBottomSheet.newInstance(data)
            modalBottomSheet.show(childFragmentManager, CalculateFlightMilesBottomSheet.TAG)
        }
    }

    private fun setBusinessData(data: ArrayList<FlightMilesResponseDataDetail>?) {
        data?.let {
            val modalBottomSheet = CalculateFlightMilesBottomSheet.newInstance(data)
            modalBottomSheet.show(childFragmentManager, CalculateFlightMilesBottomSheet.TAG)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "CalculateFlightMilesFragment"
    }
}