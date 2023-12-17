package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class CompanyInfo(
    val Code: String,
    val CompanyShortName: String,
    val Description: String
) : Parcelable