package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request

import com.google.gson.JsonObject

data class TimetableOneWayRequest(
    val requestHeader: RequestHeader,
    val OTA_AirScheduleRQ: OTAAirScheduleRQ,
    val scheduleType: String,
    val tripType: String
)

data class TimetableRoundTripRequest(
    val requestHeader: RequestHeader,
    val OTA_AirScheduleRQ: OTAAirScheduleRQ,
    val returnDate: String,
    val scheduleType: String,
    val tripType: String
)

fun TimetableOneWayRequest.timetableOneWayRequestToJsonObject(): JsonObject {
    val jsonObject = JsonObject()

    // Adding individual properties to the JsonObject
    jsonObject.add("OTA_AirScheduleRQ", createOTAAirScheduleRQJson(OTA_AirScheduleRQ))
    jsonObject.add("requestHeader", createRequestHeaderJson(requestHeader))
    jsonObject.addProperty("scheduleType", scheduleType)
    jsonObject.addProperty("tripType", tripType)

    return jsonObject
}

fun TimetableRoundTripRequest.timetableRoundTripRequestToJsonObject(): JsonObject {
    val jsonObject = JsonObject()

    // Adding individual properties to the JsonObject
    jsonObject.add("OTA_AirScheduleRQ", createOTAAirScheduleRQJson(OTA_AirScheduleRQ))
    jsonObject.add("requestHeader", createRequestHeaderJson(requestHeader))
    jsonObject.addProperty("returnDate", returnDate)
    jsonObject.addProperty("scheduleType", scheduleType)
    jsonObject.addProperty("tripType", tripType)

    return jsonObject
}

private fun createRequestHeaderJson(requestHeader: RequestHeader): JsonObject {
    val jsonObject = JsonObject()

    // Adding individual properties to the JsonObject
    jsonObject.addProperty("airlineCode", requestHeader.airlineCode)
    jsonObject.addProperty("channel", requestHeader.channel)
    jsonObject.addProperty("clientTransactionId", requestHeader.clientTransactionId)
    jsonObject.addProperty("clientUsername", requestHeader.clientUsername)
    jsonObject.addProperty("languageCode", requestHeader.languageCode)

    return jsonObject
}

private fun createOTAAirScheduleRQJson(otaAirScheduleRQ: OTAAirScheduleRQ): JsonObject {
    val jsonObject = JsonObject()

    // Adding individual properties to the JsonObject
    jsonObject.addProperty("AirlineCode", otaAirScheduleRQ.AirlineCode)
    jsonObject.add("FlightTypePref", createFlightTypePrefJson(otaAirScheduleRQ.FlightTypePref))
    jsonObject.add(
        "OriginDestinationInformation",
        createOriginDestinationInformationJson(otaAirScheduleRQ.OriginDestinationInformation)
    )

    return jsonObject
}

private fun createFlightTypePrefJson(flightTypePref: FlightTypePref): JsonObject {
    val jsonObject = JsonObject()

    // Adding individual properties to the JsonObject
    jsonObject.addProperty("DirectAndNonStopOnlyInd", flightTypePref.DirectAndNonStopOnlyInd)

    return jsonObject
}

private fun createOriginDestinationInformationJson(originDestinationInformation: OriginDestinationInformation): JsonObject {
    val jsonObject = JsonObject()

    // Adding individual properties to the JsonObject
    jsonObject.add("DepartureDateTime", createDepartureDateTimeJson(originDestinationInformation.DepartureDateTime))
    jsonObject.add("DestinationLocation", createDestinationLocationJson(originDestinationInformation.DestinationLocation))
    jsonObject.add("OriginLocation", createOriginLocationJson(originDestinationInformation.OriginLocation))

    return jsonObject
}

private fun createDepartureDateTimeJson(departureDateTime: DepartureDateTime): JsonObject {
    val jsonObject = JsonObject()

    // Adding individual properties to the JsonObject
    jsonObject.addProperty("Date", departureDateTime.Date)
    jsonObject.addProperty("WindowAfter", departureDateTime.WindowAfter)
    jsonObject.addProperty("WindowBefore", departureDateTime.WindowBefore)

    return jsonObject
}

private fun createDestinationLocationJson(location: DestinationLocation): JsonObject {
    val jsonObject = JsonObject()

    // Adding individual properties to the JsonObject
    jsonObject.addProperty("LocationCode", location.LocationCode)
    jsonObject.addProperty("MultiAirportCityInd", location.MultiAirportCityInd)

    return jsonObject
}

private fun createOriginLocationJson(location: OriginLocation): JsonObject {
    val jsonObject = JsonObject()

    // Adding individual properties to the JsonObject
    jsonObject.addProperty("LocationCode", location.LocationCode)
    jsonObject.addProperty("MultiAirportCityInd", location.MultiAirportCityInd)

    return jsonObject
}