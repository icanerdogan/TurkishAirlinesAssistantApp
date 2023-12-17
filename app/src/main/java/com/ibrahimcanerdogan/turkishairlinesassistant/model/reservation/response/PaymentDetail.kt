package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PaymentDetail(
    val PaymentAmount: PaymentAmount,
    val PaymentCard: PaymentCard,
    val PaymentType: String,
    val RPH: String
) : Parcelable