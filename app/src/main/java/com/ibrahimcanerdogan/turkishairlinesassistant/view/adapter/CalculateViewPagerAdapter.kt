package com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.calculate.flight.CalculateFlightMilesFragment
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.calculate.miles.CalculateAwardMilesFragment

class CalculateViewPagerAdapter(
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> CalculateFlightMilesFragment()
            1 -> CalculateAwardMilesFragment()
            else -> CalculateFlightMilesFragment()
        }
    }

}