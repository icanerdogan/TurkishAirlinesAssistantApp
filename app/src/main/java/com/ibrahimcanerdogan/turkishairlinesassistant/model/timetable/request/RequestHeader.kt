package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request

import com.ibrahimcanerdogan.turkishairlinesassistant.util.AppConstant
import java.util.UUID

data class RequestHeader(
    val airlineCode: String = "TK",
    val channel: String = "MOBILE",
    val clientTransactionId: String = UUID.randomUUID().toString(),
    val clientUsername: String = "OPENAPI",
    val languageCode: String = AppConstant.getDeviceLanguage()
)