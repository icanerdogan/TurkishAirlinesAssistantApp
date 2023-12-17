package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CommentX(
    val Description: String,
    val Name: String,
    val Value: String
) : Parcelable