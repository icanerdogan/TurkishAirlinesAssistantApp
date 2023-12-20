package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip

import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.ExtendedOTAAirScheduleRS

data class TimetableRoundTripOTAResponse(
    val extendedOTAAirScheduleRS: List<ExtendedOTAAirScheduleRS>
)