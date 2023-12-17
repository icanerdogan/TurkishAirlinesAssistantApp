package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PaymentCard(
    val CardCode: String,
    val CardNumber: CardNumber,
    val CardType: CardType,
    val Email: String,
    val Remark: String
) : Parcelable