package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.request

data class DepartureDateTime(
    val Date: String,
    val WindowAfter: String,
    val WindowBefore: String
)