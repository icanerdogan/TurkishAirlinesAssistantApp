package com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FlightMilesResponseData(
    @SerializedName("milesResponseDetail")
    val flightMilesResponseDataDetail: List<FlightMilesResponseDataDetail>
) : Parcelable