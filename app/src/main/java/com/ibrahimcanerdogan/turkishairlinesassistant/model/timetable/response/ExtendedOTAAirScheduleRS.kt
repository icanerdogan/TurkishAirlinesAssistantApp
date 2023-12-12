package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response

data class ExtendedOTAAirScheduleRS(
    val OTA_AirScheduleRS: OTAAirScheduleRS,
    val extraOTAAirScheduleRS: ExtraOTAAirScheduleRS
)