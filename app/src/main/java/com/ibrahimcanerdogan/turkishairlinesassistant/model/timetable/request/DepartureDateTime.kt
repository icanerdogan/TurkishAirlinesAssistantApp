package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.request

data class DepartureDateTime(
    val Date: String,
    val WindowAfter: String,
    val WindowBefore: String
)