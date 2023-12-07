package com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response

import com.google.gson.annotations.SerializedName

data class FlightMilesResponseMessage(
    @SerializedName("code")
    val flightMilesMessageCode: String,
    @SerializedName("description")
    val flightMilesMessageDescription: String
)