package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.websdom

import com.google.gson.annotations.SerializedName

data class ReservationWebsdomOTARequest(
    @SerializedName("GivenName")
    val otaRequestGivenName: String,
    @SerializedName("Surname")
    val otaRequestSurname: String,
    @SerializedName("UniqueId")
    val otaRequestUniqueId: String
)