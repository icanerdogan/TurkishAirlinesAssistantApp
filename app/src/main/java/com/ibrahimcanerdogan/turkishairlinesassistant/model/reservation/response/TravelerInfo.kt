package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TravelerInfo(
    val AirTraveler: AirTraveler,
    val SpecialReqDetails: SpecialReqDetails
) : Parcelable