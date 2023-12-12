package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

data class Ticketing(
    val CancelOnExpiryInd: Boolean,
    val FlightSegmentRefNumber: String,
    val MiscTicketingCode: String,
    val PseudoCityCode: String,
    val TicketDocumentNbr: String,
    val TicketType: String,
    val TravelerRefNumber: String
)