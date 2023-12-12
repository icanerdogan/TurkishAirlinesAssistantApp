package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.websdom

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

data class ReservationWebsdomRequest(
    @SerializedName("requestHeader")
    val requestHeader: ReservationWebsdomRequestHeader,
    @SerializedName("retrieveReservationOTARequest")
    val reservationWebsdomOTARequest: ReservationWebsdomOTARequest
)

fun ReservationWebsdomRequest.reservationWebsdomToJsonObject(): JSONObject {
    val jsonObject = JSONObject()

    val requestHeaderObject = JSONObject()
    requestHeaderObject.put("clientUsername", requestHeader.requestHeaderClientUsername)
    requestHeaderObject.put("channel", requestHeader.requestHeaderChannel)
    requestHeaderObject.put("airlineCode", requestHeader.requestHeaderAirlineCode)
    requestHeaderObject.put("clientTransactionId", requestHeader.requestHeaderClientTransactionId)

    val retrieveReservationOTARequestObject = JSONObject()
    retrieveReservationOTARequestObject.put("UniqueId", reservationWebsdomOTARequest.otaRequestUniqueId)
    retrieveReservationOTARequestObject.put("Surname", reservationWebsdomOTARequest.otaRequestSurname)
    retrieveReservationOTARequestObject.put("GivenName", reservationWebsdomOTARequest.otaRequestGivenName)

    jsonObject.put("requestHeader", requestHeaderObject)
    jsonObject.put("retrieveReservationOTARequest", retrieveReservationOTARequestObject)

    return jsonObject
}