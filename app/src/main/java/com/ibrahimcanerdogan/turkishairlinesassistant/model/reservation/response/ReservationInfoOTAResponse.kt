package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

data class ReservationInfoOTAResponse(
    val isAward: Boolean,
    val isCircleItinerary: Boolean,
    val isITTReservation: Boolean,
    val isInvoluntary: Boolean,
    val isOriginalITTReservation: Boolean,
    val isPurged: Boolean,
    val isVIPIncluded: Boolean,
    val pnrOwner: String
)