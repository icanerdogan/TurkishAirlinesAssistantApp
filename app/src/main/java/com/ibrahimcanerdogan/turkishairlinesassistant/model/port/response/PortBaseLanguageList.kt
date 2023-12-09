package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortBaseLanguageList(
    @SerializedName("Language")
    val portBaseLanguageList: List<PortBaseLanguage>
)