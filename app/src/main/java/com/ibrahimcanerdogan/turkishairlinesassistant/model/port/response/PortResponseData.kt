package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortResponseData(
    @SerializedName("Port")
    val portResponseInfo: List<PortResponseInfo>
)