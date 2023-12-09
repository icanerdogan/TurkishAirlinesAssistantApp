package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortMessage(
    @SerializedName("code")
    val portMessageCode: String,
    @SerializedName("description")
    val portMessageDescription: String
)