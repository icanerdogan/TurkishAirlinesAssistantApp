package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.calculate.flight

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.R
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentCalculateFlightMilesBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.CalculateFlightRequest
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.FlightMilesRequestDetail
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.FlightMilesRequestHeader
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request.calculateFlightToJsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate.CalculateViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
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

            buttonCalculateFlightMiles.setOnClickListener {
                Log.i(TAG, "flightMilesDetailOrigin: ${editTextOrigin.text} flightMilesDetailDestination: ${editTextDestination.text} flightMilesDetailCardType: $cardType")

                viewModel.calculateFlightMiles(
                    CalculateFlightRequest(
                        FlightMilesRequestDetail(
                            flightMilesDetailOrigin = editTextOrigin.text.toString().uppercase(),
                            flightMilesDetailDestination = editTextDestination.text.toString().uppercase(),
                            flightMilesDetailCardType = cardType,
                            flightMilesDetailClassCode = "H",
                            flightMilesDetailFlightDate = "25.12.2023",
                        ),
                        FlightMilesRequestHeader(
                            flightMilesAirlineCode = airlinesCode
                        )
                    ).calculateFlightToJsonObject()
                )
            }

            viewModel.flightMilesData.observe(viewLifecycleOwner) {
                it?.let {
                    println(it.flightMilesResponseMessage)
                    Log.i(TAG, it.flightMilesResponseMessage.flightMilesMessageDescription)

                    Toast.makeText(
                        requireContext(),
                        it.flightMilesResponseMessage.flightMilesMessageDescription,
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
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