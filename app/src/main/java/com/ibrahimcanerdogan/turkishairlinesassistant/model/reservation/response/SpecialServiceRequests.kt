package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SpecialServiceRequests(
    val SpecialServiceRequest: List<SpecialServiceRequest>
) : Parcelable