package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PersonName(
    val GivenName: String,
    val NamePrefix: String,
    val Surname: String
) : Parcelable