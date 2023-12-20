package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.oneway

import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.Message

data class TimetableOneWayResponse(
    val data: TimetableOneWayData,
    val message: Message,
    val requestId: String,
    val status: String
)