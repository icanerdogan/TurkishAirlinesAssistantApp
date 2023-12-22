package com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class FlightMilesResponseDataDetail(
    @SerializedName("baseMiles")
    val flightMilesDetailBaseMiles: String,
    @SerializedName("basePoint")
    val flightMilesDetailBasePoint: String,
    @SerializedName("cabinType")
    val flightMilesDetailCabinType: String,
    @SerializedName("classCodes")
    val flightMilesDetailClassCodes: String,
    @SerializedName("definition")
    val flightMilesDetailDefinition: String,
    @SerializedName("flightCount")
    val flightMilesDetailFlightCount: String,
    @SerializedName("promoMiles")
    val flightMilesDetailPromoMiles: String,
    @SerializedName("promoPoints")
    val flightMilesDetailPromoPoints: String,
    @SerializedName("totalMiles")
    val flightMilesDetailTotalMiles: String
) : Parcelable