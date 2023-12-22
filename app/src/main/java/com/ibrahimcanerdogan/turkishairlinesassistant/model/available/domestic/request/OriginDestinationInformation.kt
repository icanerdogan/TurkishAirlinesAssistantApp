package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request

data class OriginDestinationInformation(
    val DepartureDateTime: DepartureDateTime,
    val OriginLocation: OriginLocation,
    val DestinationLocation: DestinationLocation,
    val CabinPreferences: List<CabinPreference>
)