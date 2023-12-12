package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import com.google.gson.Gson

data class ReservationInternationalResponse(
    val data: Data,
    val message: Message,
    val requestId: String,
    val status: String
)

fun String.reservationFromJsonObject(): ReservationInternationalResponse {

    return Gson().fromJson(this, ReservationInternationalResponse::class.java)
}