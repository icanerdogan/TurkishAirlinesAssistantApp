package com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FlightMilesResponseMessage(
    @SerializedName("code")
    val flightMilesMessageCode: String,
    @SerializedName("description")
    val flightMilesMessageDescription: String
) : Parcelable