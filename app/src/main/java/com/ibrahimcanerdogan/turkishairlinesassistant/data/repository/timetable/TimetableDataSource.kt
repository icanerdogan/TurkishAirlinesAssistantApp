package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.timetable

import okhttp3.RequestBody

interface TimetableDataSource {

    suspend fun getTimetable(postData: RequestBody) : String

}