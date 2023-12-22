package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.timetable

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.tabs.TabLayoutMediator
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentTimetableBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.timetable.TimetableViewPagerAdapter
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class TimetableFragment : Fragment() {

    private var _binding: FragmentTimetableBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTimetableBinding.inflate(inflater, container, false)

        binding.apply {
            viewPager.adapter = TimetableViewPagerAdapter(requireActivity())
            TabLayoutMediator(tabLayout, viewPager) { tab, position ->
                when(position) {
                    0 -> {
                        tab.text = "One Way"
                    }
                    1 -> tab.text = "Round Trip"
                }
            }.attach()
        }

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}