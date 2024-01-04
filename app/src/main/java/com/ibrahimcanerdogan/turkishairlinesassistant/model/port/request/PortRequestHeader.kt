package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.request

import com.ibrahimcanerdogan.turkishairlinesassistant.util.AppConstant
import java.util.UUID

data class PortRequestHeader(
    val airlineCode: String = "AJ",
    val channel: String = "MOBILE",
    val clientTransactionId: String = UUID.randomUUID().toString(),
    val clientUsername: String = "OPENAPI",
    val languageCode: String = AppConstant.getDeviceLanguage()
)