package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ReservationResponse(
    val data: Data,
    val message: Message,
    val requestId: String,
    val status: String
) : Parcelable