package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.international.request

data class OriginDestinationInformation(
    val CabinPreferences: List<CabinPreference>,
    val DepartureDateTime: DepartureDateTime,
    val DestinationLocation: DestinationLocation,
    val FlightTypePref: FlightTypePref,
    val OriginLocation: OriginLocation
)