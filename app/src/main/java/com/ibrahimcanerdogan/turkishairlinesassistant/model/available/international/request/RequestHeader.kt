package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.international.request

data class RequestHeader(
    val clientTransactionId: String,
    val clientUsername: String,
    val extraParameters: List<ExtraParameter>
)