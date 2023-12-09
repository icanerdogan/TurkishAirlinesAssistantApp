package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

data class PortResponse(
    @SerializedName("data")
    val portResponseData: PortResponseData,
    @SerializedName("message")
    val portResponseMessage: PortMessage,
    @SerializedName("requestId")
    val portResponseRequestId: String,
    @SerializedName("status")
    val portResponseStatus: String
)

fun String.portFromJsonObject(): PortResponse {

    return Gson().fromJson(this, PortResponse::class.java)
}
