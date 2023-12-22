package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request

import com.google.gson.Gson
import com.google.gson.JsonArray
import com.google.gson.JsonObject

data class AvailableFlightsDomesticRequest(
    val requestHeader: RequestHeader,
    val ReducedDataIndicator: Boolean,
    val RoutingType: String,
    val TargetSource: String,
    val PassengerTypeQuantity: List<PassengerTypeQuantity>,
    val OriginDestinationInformation: List<OriginDestinationInformation>
)


fun AvailableFlightsDomesticRequest.availableFlightsDomesticRequestToJsonObject(): JsonObject {
    val gson = Gson()
    val jsonObject = JsonObject()

    // Adding individual properties to the JsonObject
    jsonObject.add("requestHeader", gson.toJsonTree(requestHeader))
    jsonObject.addProperty("ReducedDataIndicator", ReducedDataIndicator)
    jsonObject.addProperty("RoutingType", RoutingType)
    jsonObject.addProperty("TargetSource", TargetSource)

    // Adding PassengerTypeQuantity as JsonArray
    val passengerTypeQuantityArray = JsonArray()
    this.PassengerTypeQuantity.forEach {
        passengerTypeQuantityArray.add(gson.toJsonTree(it))
    }
    jsonObject.add("PassengerTypeQuantity", passengerTypeQuantityArray)

    // Adding OriginDestinationInformation as JsonArray
    val originDestinationInformationArray = JsonArray()
    this.OriginDestinationInformation.forEach {
        originDestinationInformationArray.add(gson.toJsonTree(it))
    }
    jsonObject.add("OriginDestinationInformation", originDestinationInformationArray)

    return jsonObject

}