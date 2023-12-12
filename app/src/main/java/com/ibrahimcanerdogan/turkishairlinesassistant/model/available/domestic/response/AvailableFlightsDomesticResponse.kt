package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

import com.google.gson.Gson

data class AvailableFlightsDomesticResponse(
    val data: Data,
    val message: Message,
    val requestId: String,
    val status: String
)

fun String.availableFlightsDomesticResponseFromJsonObject(): AvailableFlightsDomesticResponse {

    return Gson().fromJson(this, AvailableFlightsDomesticResponse::class.java)
}