package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CardType(
    val Code: String,
    val Description: String,
    val Explanationx: String,
    val List_PaymentCardIssuer_Basex: String
) : Parcelable