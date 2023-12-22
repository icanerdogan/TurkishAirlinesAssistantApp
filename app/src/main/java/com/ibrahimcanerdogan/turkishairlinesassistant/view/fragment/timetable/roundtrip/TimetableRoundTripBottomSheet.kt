package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.timetable.roundtrip

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.google.android.material.tabs.TabLayoutMediator
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.BottomSheetTimetableRoundTripBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.OriginDestinationOption
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip.TimetableRoundTripResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.timetable.TimetableRoundTripViewPagerAdapter

class TimetableRoundTripBottomSheet(
    private val timetableResponse: TimetableRoundTripResponse
) : BottomSheetDialogFragment()  {

    private var _binding: BottomSheetTimetableRoundTripBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetTimetableRoundTripBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dialog?.let {
            val sheet = it as BottomSheetDialog
            sheet.behavior.state = BottomSheetBehavior.STATE_HALF_EXPANDED
        }

        binding.apply {
            var resultDepartureFlights = emptyList<OriginDestinationOption>()
            var resultReturnFlights = emptyList<OriginDestinationOption>()

            timetableResponse.data.timeTableOTAResponse.extendedOTAAirScheduleRS?.let {
                resultDepartureFlights = it[0].OTA_AirScheduleRS.OriginDestinationOptions.OriginDestinationOption
                resultReturnFlights = it[1].OTA_AirScheduleRS.OriginDestinationOptions.OriginDestinationOption
            }

            timetableViewPager.adapter = TimetableRoundTripViewPagerAdapter(requireActivity(), ArrayList(resultDepartureFlights), ArrayList(resultReturnFlights))
            TabLayoutMediator(timetableIndicator, timetableViewPager) { _, _ -> }.attach()
        }

    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

    companion object {
        const val TAG = "TimetableRoundTripBottomSheet"

        @JvmStatic
        fun newInstance(timetableResponse: TimetableRoundTripResponse) =
            TimetableRoundTripBottomSheet(timetableResponse).apply {
                arguments = Bundle().apply {
                    putParcelable(TAG, timetableResponse)
                }
            }
    }

}