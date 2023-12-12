package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

data class PaymentAmount(
    val Amount: String,
    val CurrencyCode: String,
    val DecimalPlaces: String
)