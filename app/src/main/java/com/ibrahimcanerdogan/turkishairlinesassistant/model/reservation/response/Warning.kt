package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Warning(
    val Description: String,
    val Tag: String,
    val Type: String,
    val Value: Boolean
) : Parcelable