package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request

data class OTAAirScheduleRQ(
    val AirlineCode: String = "TK",
    val FlightTypePref: FlightTypePref,
    val OriginDestinationInformation: OriginDestinationInformation
)