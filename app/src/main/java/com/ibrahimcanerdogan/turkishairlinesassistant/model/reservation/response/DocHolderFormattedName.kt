package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class DocHolderFormattedName(
    val GivenName: String,
    val Surname: String
) : Parcelable