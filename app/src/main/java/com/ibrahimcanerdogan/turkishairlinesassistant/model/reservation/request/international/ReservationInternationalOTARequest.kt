package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.request.international

import com.google.gson.annotations.SerializedName

data class ReservationInternationalOTARequest(
    @SerializedName("Surname")
    val otaRequestSurname: String,
    @SerializedName("UniqueId")
    val otaRequestUniqueId: String
)