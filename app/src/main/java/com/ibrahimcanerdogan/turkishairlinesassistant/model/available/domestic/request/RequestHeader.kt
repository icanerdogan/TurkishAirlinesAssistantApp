package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request

import java.util.UUID

data class RequestHeader(
    val channel: String = "MOBILE",
    val clientTransactionId: String = UUID.randomUUID().toString(),
    val clientUsername: String = "OPENAPI"
)