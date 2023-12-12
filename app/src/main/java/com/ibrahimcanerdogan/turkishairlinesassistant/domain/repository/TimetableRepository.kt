package com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository

import com.google.gson.JsonObject

interface TimetableRepository {

    suspend fun apiTimetable(postData: JsonObject): String?

}