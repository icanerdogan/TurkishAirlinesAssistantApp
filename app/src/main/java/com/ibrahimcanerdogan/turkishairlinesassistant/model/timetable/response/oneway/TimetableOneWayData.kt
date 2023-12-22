package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.oneway

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TimetableOneWayData(
    val timeTableOTAResponse: TimetableOneWayOTAResponse
) : Parcelable