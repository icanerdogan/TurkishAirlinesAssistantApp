package com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.request

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

data class CalculateFlightRequest(
    @SerializedName("calculateFlightMilesDetail")
    val flightMilesRequestDetail: FlightMilesRequestDetail,
    @SerializedName("requestHeader")
    val flightMilesRequestHeader: FlightMilesRequestHeader
)

fun CalculateFlightRequest.calculateFlightToJsonObject(): JSONObject {
    val jsonObject = JSONObject()

    val requestHeaderObject = JSONObject()
    requestHeaderObject.put("clientCode", flightMilesRequestHeader.flightMilesClientCode)
    requestHeaderObject.put("clientUsername", flightMilesRequestHeader.flightMilesClientUsername)
    requestHeaderObject.put("channel", flightMilesRequestHeader.flightMilesChannel)
    requestHeaderObject.put("airlineCode", flightMilesRequestHeader.flightMilesAirlineCode)
    requestHeaderObject.put("application", flightMilesRequestHeader.flightMilesApplication)
    requestHeaderObject.put("clientTransactionId", flightMilesRequestHeader.flightMilesClientTransactionId)
    requestHeaderObject.put("languageCode", flightMilesRequestHeader.flightMilesLanguageCode)

    val calculateMilesObject = JSONObject()
    calculateMilesObject.put("card_type", flightMilesRequestDetail.flightMilesDetailCardType)
    calculateMilesObject.put("class_code", flightMilesRequestDetail.flightMilesDetailClassCode)
    calculateMilesObject.put("destination", flightMilesRequestDetail.flightMilesDetailDestination)
    calculateMilesObject.put("flightDate", flightMilesRequestDetail.flightMilesDetailFlightDate)
    calculateMilesObject.put("origin", flightMilesRequestDetail.flightMilesDetailOrigin)

    jsonObject.put("requestHeader", requestHeaderObject)
    jsonObject.put("calculateFlightMilesDetail", calculateMilesObject)

    return jsonObject
}

/*
{
    "requestHeader": {
        "clientCode": "WEBSDOM",
        "clientUsername": "WEBSDOM",
        "channel": "WEB",
        "airlineCode": "TK",
        "application": "LOYALTY_SERVICE",
        "clientTransactionId": "1608296844337",
        "languageCode": "EN"
    },
    "calculateFlightMilesDetail": {
        "card_type": "CC",
        "class_code": "H",
        "destination": "DSS",
        "flightDate": "19.12.2020",
        "origin": "IST"
    }
}
*/