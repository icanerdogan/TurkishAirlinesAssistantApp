package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.websdom

import com.google.gson.annotations.SerializedName
import java.util.UUID

data class ReservationWebsdomRequestHeader(
    @SerializedName("airlineCode")
    val requestHeaderAirlineCode: String,
    @SerializedName("channel")
    val requestHeaderChannel: String = "MOBILE",
    @SerializedName("clientTransactionId")
    val requestHeaderClientTransactionId: String = UUID.randomUUID().toString(),
    @SerializedName("clientUsername")
    val requestHeaderClientUsername: String = "WEBSDOM"
)