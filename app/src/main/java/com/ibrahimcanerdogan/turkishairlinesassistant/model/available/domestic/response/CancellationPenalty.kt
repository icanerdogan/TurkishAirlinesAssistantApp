package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

data class CancellationPenalty(
    val IsRefundable: Boolean,
    val PercentageOrFixedAmount: PercentageOrFixedAmount,
    val TimeToDeparture: TimeToDeparture
)