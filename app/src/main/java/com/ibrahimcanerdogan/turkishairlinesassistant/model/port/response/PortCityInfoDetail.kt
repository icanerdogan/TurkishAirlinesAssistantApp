package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortCityInfoDetail(
    @SerializedName("Code")
    val portCityInfoDetailCode: String
)