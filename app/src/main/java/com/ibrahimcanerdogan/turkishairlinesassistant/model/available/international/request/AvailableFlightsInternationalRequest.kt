package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.international.request

data class AvailableFlightsInternationalRequest(
    val OriginDestinationInformation: List<OriginDestinationInformation>,
    val PassengerTypeQuantity: List<PassengerTypeQuantity>,
    val ReducedDataIndicator: Boolean,
    val RoutingType: String,
    val TargetSource: String,
    val requestHeader: RequestHeader
)