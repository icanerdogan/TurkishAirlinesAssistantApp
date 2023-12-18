package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.timetable

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentTimetableBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.timetable.TimetableViewPagerAdapter
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable.TimetableViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable.TimetableViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TimetableFragment : Fragment() {

    private var _binding: FragmentTimetableBinding? = null
    private val binding get() = _binding!!

    private val viewModel by lazy {
        ViewModelProvider(this, factory).get(TimetableViewModel::class.java)
    }

    @Inject
    lateinit var factory: TimetableViewModelFactory

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