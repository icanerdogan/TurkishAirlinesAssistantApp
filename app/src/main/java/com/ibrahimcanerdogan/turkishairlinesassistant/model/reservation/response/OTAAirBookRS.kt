package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

data class OTAAirBookRS(
    val AirReservation: AirReservation,
    val RetransmissionIndicator: Boolean,
    val TimeStamp: String,
    val Version: String,
    val Warnings: Warnings
)