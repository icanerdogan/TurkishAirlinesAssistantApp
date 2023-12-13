package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.timetable

import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.TimetableResponse
import okhttp3.RequestBody

interface TimetableDataSource {

    suspend fun getTimetable(postData: RequestBody) : TimetableResponse

}