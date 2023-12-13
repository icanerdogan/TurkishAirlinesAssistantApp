package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

data class ReservationResponse(
    val data: Data,
    val message: Message,
    val requestId: String,
    val status: String
)