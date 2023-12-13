package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response

data class TimetableResponse(
    val data: Data,
    val message: Message,
    val status: String
)