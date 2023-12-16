package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.calculate.flight

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.tabs.TabLayoutMediator
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.BottomSheetCalculateFlightMilesBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.FlightMilesResponseDataDetail
import com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.calculate.CalculateFlightBottomSheetAdapter

class CalculateFlightMilesBottomSheet(
    private val calculateFlightMilesResponse: ArrayList<FlightMilesResponseDataDetail>?
) : BottomSheetDialogFragment() {

    private var _binding: BottomSheetCalculateFlightMilesBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetCalculateFlightMilesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dialog?.let {
            val sheet = it as BottomSheetDialog
            sheet.behavior.state = BottomSheetBehavior.STATE_EXPANDED
        }

        binding.apply {
            flightMilesViewPager.adapter = CalculateFlightBottomSheetAdapter(calculateFlightMilesResponse!!)
            TabLayoutMediator(flightMilesIndicator, flightMilesViewPager) { _, _ -> }.attach()

        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

    companion object {
        const val TAG = "CalculateFlightMilesBottomSheet"

        @JvmStatic
        fun newInstance(calculateFlightMilesResponse: ArrayList<FlightMilesResponseDataDetail>?) =
            CalculateFlightMilesBottomSheet(calculateFlightMilesResponse).apply {
                arguments = Bundle().apply {
                    putParcelableArrayList(TAG, calculateFlightMilesResponse)
                }
            }
    }

}