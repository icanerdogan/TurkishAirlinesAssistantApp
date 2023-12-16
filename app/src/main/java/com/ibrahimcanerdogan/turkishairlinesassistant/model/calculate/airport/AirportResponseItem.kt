package com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.airport

import com.google.gson.annotations.SerializedName

data class AirportResponseItem(
    @SerializedName("name")
    val airportName: String,
    @SerializedName("iata_code")
    val airportIataCode: String,
    @SerializedName("country")
    val airportCountry: String,
    @SerializedName("city")
    val airportCity: String,
)