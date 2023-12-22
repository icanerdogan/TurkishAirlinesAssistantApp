package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TimetableRoundTripData(
    val timeTableOTAResponse: TimetableRoundTripOTAResponse
) : Parcelable