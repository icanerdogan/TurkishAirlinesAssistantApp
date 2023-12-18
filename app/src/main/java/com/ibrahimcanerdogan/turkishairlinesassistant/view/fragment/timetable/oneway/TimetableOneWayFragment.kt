package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.timetable.oneway

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.R
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentTimetableOneWayBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable.TimetableViewModel
import com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable.TimetableViewModelFactory
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class TimetableOneWayFragment : Fragment() {

    private var _binding: FragmentTimetableOneWayBinding? = null
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
        _binding = FragmentTimetableOneWayBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "TimetableOneWayFragment"
    }
}