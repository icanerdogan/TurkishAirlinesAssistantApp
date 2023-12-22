package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class OriginDestinationOptions(
    val DestinationCode: String,
    val OriginCode: String,
    val OriginDestinationOption: List<OriginDestinationOption>
) : Parcelable