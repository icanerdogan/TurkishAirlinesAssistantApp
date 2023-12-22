package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortTag(
    @SerializedName("PortTagLanguage")
    val portTagLanguage: List<PortTagLanguage>
)