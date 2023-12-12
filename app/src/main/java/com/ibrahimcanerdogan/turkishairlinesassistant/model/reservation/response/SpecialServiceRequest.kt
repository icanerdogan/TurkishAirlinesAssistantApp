package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

data class SpecialServiceRequest(
    val FlightRefNumberRPHList: String,
    val Number: String,
    val SSRCode: String,
    val Text: String,
    val TravelerRefNumberRPHList: String
)