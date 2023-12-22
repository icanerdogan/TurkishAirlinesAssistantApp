package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.timetable.roundtrip

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.FragmentTimetableRoundTripReturnBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.OriginDestinationOption
import com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.timetable.TimetableRoundTripReturnBottomSheetAdapter

class TimetableRoundTripFragmentReturn(
    private val timetableResponse: ArrayList<OriginDestinationOption>
) : Fragment() {

    private var _binding: FragmentTimetableRoundTripReturnBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTimetableRoundTripReturnBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            recyclerViewReturn.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            recyclerViewReturn.adapter = TimetableRoundTripReturnBottomSheetAdapter(timetableResponse)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    companion object {
        const val TAG = "TimetableRoundTripFragmentReturn"
    }

}