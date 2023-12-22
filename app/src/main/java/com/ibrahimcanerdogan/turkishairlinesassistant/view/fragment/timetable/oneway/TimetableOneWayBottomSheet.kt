package com.ibrahimcanerdogan.turkishairlinesassistant.view.fragment.timetable.oneway

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ibrahimcanerdogan.turkishairlinesassistant.databinding.BottomSheetTimetableOneWayBinding
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.oneway.TimetableOneWayResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.view.adapter.timetable.TimetableOneWayBottomSheetAdapter

class TimetableOneWayBottomSheet(
    private val timetableResponse: TimetableOneWayResponse
) : BottomSheetDialogFragment() {

    private var _binding: BottomSheetTimetableOneWayBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = BottomSheetTimetableOneWayBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dialog?.let {
            val sheet = it as BottomSheetDialog
            sheet.behavior.state = BottomSheetBehavior.STATE_HALF_EXPANDED
        }

        binding.apply {
            val resultList = timetableResponse.data.timeTableOTAResponse.extendedOTAAirScheduleRS.OTA_AirScheduleRS.OriginDestinationOptions.OriginDestinationOption

            recyclerViewOneWay.layoutManager = LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false)
            recyclerViewOneWay.adapter = TimetableOneWayBottomSheetAdapter(resultList)

            textViewResult.text = "${resultList.size} flights found."
        }
    }

    override fun onDestroy() {
        _binding = null
        super.onDestroy()
    }

    companion object {
        const val TAG = "TimetableOneWayBottomSheet"

        @JvmStatic
        fun newInstance(timetableResponse: TimetableOneWayResponse) =
            TimetableOneWayBottomSheet(timetableResponse).apply {
                arguments = Bundle().apply {
                    putParcelable(TAG, timetableResponse)
                }
            }
    }

}