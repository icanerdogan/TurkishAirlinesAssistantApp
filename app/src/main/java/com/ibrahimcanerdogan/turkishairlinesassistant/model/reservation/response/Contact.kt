package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

data class Contact(
    val email: String,
    val emailLanguage: String,
    val mobilePhone: String,
    val name: String,
    val passengerIndex: String,
    val receiveSMS: Boolean,
    val receiveSMSLanguage: String
)