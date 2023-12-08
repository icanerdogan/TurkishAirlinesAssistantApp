package com.ibrahimcanerdogan.turkishairlinesassistant.util

import java.util.Locale

object AppConstant {
    const val BASE_URL = "https://api.turkishairlines.com/test/"
    const val NETWORK_CALL_TIMEOUT = 60L

    fun getDeviceLanguage() : String {
        return if (Locale.getDefault().displayLanguage == "tr") "TR"
        else "EN"
    }
}