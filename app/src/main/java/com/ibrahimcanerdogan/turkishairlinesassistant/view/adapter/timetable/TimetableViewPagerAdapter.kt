package com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.timetable

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.timetable.oneway.TimetableOneWayFragment
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.timetable.roundtrip.TimetableRoundTripFragment

class TimetableViewPagerAdapter(
    private val fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> TimetableOneWayFragment()
            1 -> TimetableRoundTripFragment()
            else -> TimetableOneWayFragment()
        }
    }


}