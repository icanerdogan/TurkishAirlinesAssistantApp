package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortCountry(
    @SerializedName("Code")
    val portCountryCode: String,
    @SerializedName("LanguageInfo")
    val portCountryLanguageInfo: PortCountryLanguage
)