package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CustLoyalty(
    val MembershipID: String,
    val ProgramID: String,
    val CustomerType: String? = null
) : Parcelable