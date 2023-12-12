package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

data class RetrieveReservationOTAResponse(
    val OTA_AirBookRS: OTAAirBookRS,
    val WKSC_Info: String,
    val baggage: String,
    val contact: Contact,
    val reservationInfoOTAResponse: ReservationInfoOTAResponse,
    val svc: String
)