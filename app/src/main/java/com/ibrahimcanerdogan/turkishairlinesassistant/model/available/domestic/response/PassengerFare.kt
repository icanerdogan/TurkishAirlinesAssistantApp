package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

data class PassengerFare(
    val BaseFare: BaseFare,
    val FareBaggageAllowance: List<FareBaggageAllowance>,
    val Taxes: Taxes,
    val TotalFare: TotalFare
)