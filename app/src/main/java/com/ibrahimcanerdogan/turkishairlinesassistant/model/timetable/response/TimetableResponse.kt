package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response

import com.google.gson.Gson

data class TimetableResponse(
    val data: Data,
    val message: Message,
    val status: String
)

fun String.timetableResponseFromJsonObject(): TimetableResponse {

    return Gson().fromJson(this, TimetableResponse::class.java)
}