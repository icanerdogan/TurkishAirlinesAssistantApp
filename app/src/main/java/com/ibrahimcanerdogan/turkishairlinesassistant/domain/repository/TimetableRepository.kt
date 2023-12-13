package com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository

import com.google.gson.JsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.TimetableResponse

interface TimetableRepository {

    suspend fun apiTimetable(postData: JsonObject): TimetableResponse?

}