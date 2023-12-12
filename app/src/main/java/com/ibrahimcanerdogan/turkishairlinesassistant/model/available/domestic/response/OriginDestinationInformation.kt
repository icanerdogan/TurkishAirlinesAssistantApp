package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

data class OriginDestinationInformation(
    val ArrivalDateTime: String,
    val DepartureDateTime: String,
    val DestinationLocation: DestinationLocation,
    val OriginDestinationOptions: OriginDestinationOptions,
    val OriginLocation: OriginLocation,
    val RPH: String
)