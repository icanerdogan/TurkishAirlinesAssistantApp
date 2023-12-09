package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortRegion(
    @SerializedName("LanguageInfo")
    val portRegionLanguageInfo: PortBaseLanguageList,
    @SerializedName("code")
    val portRegionCode: String
)