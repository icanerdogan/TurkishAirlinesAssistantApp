package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Telephone(
    val PhoneNumber: String,
    val PhoneUseType: String,
    val Remark: String
) : Parcelable