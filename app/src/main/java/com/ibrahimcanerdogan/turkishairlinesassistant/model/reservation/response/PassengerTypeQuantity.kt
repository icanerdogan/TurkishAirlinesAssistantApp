package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PassengerTypeQuantity(
    val Quantity: String
) : Parcelable