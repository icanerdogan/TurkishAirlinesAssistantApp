package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FlightExtraInfo(
    val RPH: String,
    val flightDuration: String,
    val totalDuration: String,
    val transferDuration: String
) : Parcelable