package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.request

import com.ibrahimcanerdogan.turkishairlinesassistant.util.AppConstant

data class PortRequestHeader(
    val airlineCode: String = "TK",
    val channel: String = "MOBILE",
    val clientTransactionId: String = "CLIENT_TEST_1",
    val clientUsername: String = "OPENAPI",
    val languageCode: String = AppConstant.getDeviceLanguage()
)