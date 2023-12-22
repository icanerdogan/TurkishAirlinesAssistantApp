package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ExtraOTAAirScheduleRS(
    val extraOTAAirScheduleRSListType: ExtraOTAAirScheduleRSListType
) : Parcelable