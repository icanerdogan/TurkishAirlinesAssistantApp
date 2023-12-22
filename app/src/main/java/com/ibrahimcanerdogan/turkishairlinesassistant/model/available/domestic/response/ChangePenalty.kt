package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

data class ChangePenalty(
    val IsChangeable: Boolean,
    val TimeToDeparture: TimeToDeparture
)