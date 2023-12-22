package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class OperatingAirline(
    val Code: String,
    val FlightNumber: String,
    val Value: String
) : Parcelable