package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortCityInfo(
    @SerializedName("Port")
    val portCityInfoDetail: PortCityInfoDetail
)