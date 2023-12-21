package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ExtendedOTAAirScheduleRS(
    val OTA_AirScheduleRS: OTAAirScheduleRS,
    val extraOTAAirScheduleRS: ExtraOTAAirScheduleRS
) : Parcelable