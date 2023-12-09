package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.request

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

data class PortRequest(
    @SerializedName("requestHeader")
    val requestHeader: PortRequestHeader
)

fun PortRequest.toJsonObject(): JSONObject {
     val jsonObject = JSONObject()

    val requestHeaderObject = JSONObject()
    requestHeaderObject.put("clientUsername", requestHeader.clientUsername)
    requestHeaderObject.put("channel", requestHeader.channel)
    requestHeaderObject.put("airlineCode", requestHeader.airlineCode)
    requestHeaderObject.put("clientTransactionId", requestHeader.clientTransactionId)
    requestHeaderObject.put("languageCode", requestHeader.languageCode)

    jsonObject.put("requestHeader", requestHeaderObject)

    return jsonObject
}