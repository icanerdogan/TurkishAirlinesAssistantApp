package com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response

import com.google.gson.annotations.SerializedName

data class FlightMilesResponseData(
    @SerializedName("milesResponseDetail")
    val flightMilesResponseDataDetail: FlightMilesResponseDataDetail
)