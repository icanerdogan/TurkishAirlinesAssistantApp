package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip

import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.Message

data class TimetableRoundTripResponse(
    val data: TimetableRoundTripData,
    val message: Message,
    val requestId: String,
    val status: String
)