package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortBaseLanguage(
    @SerializedName("Code")
    val portBaseLanguageCode: String,
    @SerializedName("Name")
    val portBaseLanguageName: String
)