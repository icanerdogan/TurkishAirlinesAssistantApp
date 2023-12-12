package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

data class PTCFareBreakdown(
    val FareBasisCodes: FareBasisCodes,
    val FareInfo: FareInfo,
    val PassengerFare: PassengerFare,
    val PassengerTypeQuantity: PassengerTypeQuantity
)