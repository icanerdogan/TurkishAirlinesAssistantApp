package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortCountryLanguage(
    @SerializedName("Language")
    val portCountryBaseLanguage: PortBaseLanguage
)