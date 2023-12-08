package com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response

import com.google.gson.annotations.SerializedName

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
)