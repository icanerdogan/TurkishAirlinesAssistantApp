package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName

data class PortCoordinate(
    @SerializedName("latitude")
    val portCoordinateLatitude: String,
    @SerializedName("longitude")
    val portCoordinateLongitude: String
)