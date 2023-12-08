package com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request

import com.google.gson.annotations.SerializedName
import com.ibrahimcanerdogan.turkishairlinesassistant.util.AppConstant
import java.util.UUID

data class FlightMilesRequestHeader(
    @SerializedName("airlineCode")
    val flightMilesAirlineCode: String = "TK",
    @SerializedName("application")
    val flightMilesApplication: String = "IBRAHIMCANERDOGAN_TURKISHAIRLINESASSISTANT",
    @SerializedName("channel")
    val flightMilesChannel: String = "MOBILE",
    @SerializedName("clientCode")
    val flightMilesClientCode: String = "WEBSDOM",
    @SerializedName("clientTransactionId")
    val flightMilesClientTransactionId: String = UUID.randomUUID().toString(),
    @SerializedName("clientUsername")
    val flightMilesClientUsername: String = "WEBSDOM",
    @SerializedName("languageCode")
    val flightMilesLanguageCode: String = AppConstant.getDeviceLanguage()
)