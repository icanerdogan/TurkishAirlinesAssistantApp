package com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.timetable

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.OriginDestinationOption
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.timetable.roundtrip.TimetableRoundTripFragmentDeparture
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.timetable.roundtrip.TimetableRoundTripFragmentReturn

class TimetableRoundTripViewPagerAdapter(
    fragmentActivity: FragmentActivity,
    private val timetableDepartureResponse: ArrayList<OriginDestinationOption>,
    private val timetableReturnResponse: ArrayList<OriginDestinationOption>
) : FragmentStateAdapter(fragmentActivity){

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> TimetableRoundTripFragmentDeparture(timetableDepartureResponse)
            1 -> TimetableRoundTripFragmentReturn(timetableReturnResponse)
            else -> TimetableRoundTripFragmentDeparture(timetableDepartureResponse)
        }
    }
}