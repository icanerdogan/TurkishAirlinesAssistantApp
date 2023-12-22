package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortCity(
    @SerializedName("Code")
    val portCityCode: String,
    @SerializedName("LanguageInfo")
    val portCityLanguageInfo: PortBaseLanguageList,
    @SerializedName("PortsInCity")
    val portCityInfo: PortCityInfo
)