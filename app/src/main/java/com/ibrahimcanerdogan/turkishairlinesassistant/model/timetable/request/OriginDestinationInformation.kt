package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request

data class OriginDestinationInformation(
    val DepartureDateTime: DepartureDateTime,
    val DestinationLocation: DestinationLocation,
    val OriginLocation: OriginLocation
)