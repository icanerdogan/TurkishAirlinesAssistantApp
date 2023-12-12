package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

data class PaymentDetail(
    val PaymentAmount: PaymentAmount,
    val PaymentCard: PaymentCard,
    val PaymentType: String,
    val RPH: String
)