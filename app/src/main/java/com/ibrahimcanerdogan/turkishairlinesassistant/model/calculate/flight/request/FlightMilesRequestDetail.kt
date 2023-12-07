package com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request

import com.google.gson.annotations.SerializedName

data class FlightMilesRequestDetail(
    @SerializedName("card_type")
    val flightMilesDetailCardType: String,
    @SerializedName("class_code")
    val flightMilesDetailClassCode: String,
    @SerializedName("destination")
    val flightMilesDetailDestination: String,
    @SerializedName("flightDate")
    val flightMilesDetailFlightDate: String,
    @SerializedName("origin")
    val flightMilesDetailOrigin: String
)