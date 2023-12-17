package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class OTAAirBookRS(
    val AirReservation: AirReservation,
    val RetransmissionIndicator: Boolean,
    val TimeStamp: String,
    val Version: String,
    val Warnings: Warnings
) : Parcelable