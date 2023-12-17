package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PaymentAmount(
    val Amount: String,
    val CurrencyCode: String,
    val DecimalPlaces: String
) : Parcelable