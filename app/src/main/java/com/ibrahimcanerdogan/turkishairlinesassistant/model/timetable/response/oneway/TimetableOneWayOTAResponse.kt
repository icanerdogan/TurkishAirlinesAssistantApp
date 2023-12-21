package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.oneway

import android.os.Parcelable
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.ExtendedOTAAirScheduleRS
import kotlinx.parcelize.Parcelize

@Parcelize
data class TimetableOneWayOTAResponse(
    val extendedOTAAirScheduleRS: ExtendedOTAAirScheduleRS
) : Parcelable