package com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.reservation

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.reservation.domestic.ReservationDomesticFragment
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.reservation.international.ReservationInternationalFragment

class ReservationViewPagerAdapter(
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {

    override fun getItemCount(): Int {
        return 2
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> ReservationDomesticFragment()
            1 -> ReservationInternationalFragment()
            else -> ReservationDomesticFragment()
        }
    }

}