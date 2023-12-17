package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class SpecialServiceRequest(
    val FlightRefNumberRPHList: String,
    val Number: String,
    val SSRCode: String,
    val Text: String,
    val TravelerRefNumberRPHList: String
) : Parcelable