package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

data class ReservationInternationalRequest(
    @SerializedName("requestHeader")
    val requestHeader: ReservationInternationalRequestHeader,
    @SerializedName("retrieveReservationOTARequest")
    val reservationInternationalOTARequest: ReservationInternationalOTARequest
)

fun ReservationInternationalRequest.reservationInternationalToJsonObject(): JSONObject {
    val jsonObject = JSONObject()

    val requestHeaderObject = JSONObject()
    requestHeaderObject.put("clientUsername", requestHeader.requestHeaderClientUsername)
    requestHeaderObject.put("channel", requestHeader.requestHeaderChannel)
    requestHeaderObject.put("airlineCode", requestHeader.requestHeaderAirlineCode)
    requestHeaderObject.put("clientTransactionId", requestHeader.requestHeaderClientTransactionId)

    val retrieveReservationOTARequestObject = JSONObject()
    retrieveReservationOTARequestObject.put("UniqueId", reservationInternationalOTARequest.otaRequestUniqueId)
    retrieveReservationOTARequestObject.put("Surname", reservationInternationalOTARequest.otaRequestSurname)

    jsonObject.put("requestHeader", requestHeaderObject)
    jsonObject.put("retrieveReservationOTARequest", retrieveReservationOTARequestObject)

    return jsonObject
}