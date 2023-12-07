package com.ibrahimcanerdogan.turkishairlinesassistant.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.ibrahimcanerdogan.turkishairlinesassistant.R
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.ActivityMainBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.AvailableFragment
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.CalculateMilesFragment
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.PortFragment
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.ReservationFragment
import com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.TimetableFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // First Fragment
        replaceFragment(AvailableFragment())

        binding.apply {
            bottomNavigationView.menu.getItem(2).isChecked = true
            bottomNavigationView.setOnItemSelectedListener {
                when(it.itemId) {
                    R.id.bottom_menu_available -> replaceFragment(AvailableFragment())
                    R.id.bottom_menu_calculate -> replaceFragment(CalculateMilesFragment())
                    R.id.bottom_menu_port -> replaceFragment(PortFragment())
                    R.id.bottom_menu_timetable -> replaceFragment(TimetableFragment())
                    R.id.bottom_menu_reservation -> replaceFragment(ReservationFragment())
                }
                true
            }

        }
    }

    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainerView, fragment).commit()
    }
}