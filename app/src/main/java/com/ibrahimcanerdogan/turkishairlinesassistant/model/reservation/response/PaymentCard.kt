package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

data class PaymentCard(
    val CardCode: String,
    val CardNumber: CardNumber,
    val CardType: CardType,
    val Email: String,
    val Remark: String
)