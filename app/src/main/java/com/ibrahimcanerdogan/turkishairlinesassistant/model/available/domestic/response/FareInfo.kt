package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

data class FareInfo(
    val FareInfo: List<FareInfoX>,
    val FareReference: List<FareReference>,
    val PassengerFare: String
)