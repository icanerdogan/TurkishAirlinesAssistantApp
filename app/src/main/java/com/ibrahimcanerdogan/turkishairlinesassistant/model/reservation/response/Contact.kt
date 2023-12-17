package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Contact(
    val email: String,
    val emailLanguage: String,
    val mobilePhone: String,
    val name: String,
    val passengerIndex: String,
    val receiveSMS: Boolean,
    val receiveSMSLanguage: String
) : Parcelable