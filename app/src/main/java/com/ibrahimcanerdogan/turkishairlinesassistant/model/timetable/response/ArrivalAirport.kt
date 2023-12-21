package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ArrivalAirport(
    val CodeContext: String,
    val LocationCode: String
) : Parcelable