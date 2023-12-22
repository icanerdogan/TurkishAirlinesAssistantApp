package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip

import android.os.Parcelable
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.ExtendedOTAAirScheduleRS
import kotlinx.parcelize.Parcelize

@Parcelize
data class TimetableRoundTripOTAResponse(
    val extendedOTAAirScheduleRS: List<ExtendedOTAAirScheduleRS>?
) : Parcelable