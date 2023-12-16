package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.calculate.flight

import android.R.attr.editable
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentCalculateFlightMilesBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.CalculateFlightRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.FlightMilesRequestDetail
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.FlightMilesRequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.calculateFlightToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.FlightMilesResponseDataDetail
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import java.util.Locale
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
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
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
            binding.editTextOrigin.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
                override fun afterTextChanged(s: Editable?) {
                    val text = s.toString()
                    val upperCaseText = text.uppercase(Locale.getDefault())

                    if (text != upperCaseText) {
                        binding.editTextOrigin.setText(upperCaseText)
                        binding.editTextOrigin.setSelection(upperCaseText.length)
                    }
                }
            })

            binding.editTextDestination.addTextChangedListener(object : TextWatcher {
                override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
                override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
                override fun afterTextChanged(s: Editable?) {
                    val text = s.toString()
                    val upperCaseText = text.uppercase(Locale.getDefault())

                    if (text != upperCaseText) {
                        binding.editTextDestination.setText(upperCaseText)
                        binding.editTextDestination.setSelection(upperCaseText.length)
                    }
                }
            })

            buttonCalculateFlightMiles.setOnClickListener {
                Log.i(TAG, "flightMilesDetailOrigin: ${editTextOrigin.text} flightMilesDetailDestination: ${editTextDestination.text} flightMilesDetailCardType: $cardType")

                val requestData = CalculateFlightRequest(
                    FlightMilesRequestDetail(
                        flightMilesDetailOrigin = editTextOrigin.text.toString(),
                        flightMilesDetailDestination = editTextDestination.text.toString(),
                        flightMilesDetailCardType = cardType,
                        flightMilesDetailFlightDate = "25.12.2023",
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