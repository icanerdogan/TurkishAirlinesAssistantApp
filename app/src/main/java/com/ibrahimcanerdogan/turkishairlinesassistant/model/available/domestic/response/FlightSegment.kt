package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

data class FlightSegment(
    val ArrivalAirport: ArrivalAirport,
    val ArrivalDateTime: String,
    val BookingClassAvail: List<BookingClassAvail>,
    val CodeshareInd: Boolean,
    val DateChangeNbr: Boolean,
    val DepartureAirport: DepartureAirport,
    val DepartureDateTime: String,
    val Equipment: Equipment,
    val FlightNumber: String,
    val JourneyDuration: String,
    val OperatingAirline: OperatingAirline,
    val StopQuantity: String,
    val Ticket: String
)