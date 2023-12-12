package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response

data class OriginDestinationOptions(
    val DestinationCode: String,
    val OriginCode: String,
    val OriginDestinationOption: List<OriginDestinationOption>
)