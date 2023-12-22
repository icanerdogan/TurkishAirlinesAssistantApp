package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortTagLanguage(
    @SerializedName("Code")
    val portTagLanguageCode: String,
    @SerializedName("Name")
    val portTagLanguageName: String
)