package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.timetable

import com.ibrahimcanerdogan.turkishairlinesassistant.data.remote.APIService
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.TimetableResponse
import okhttp3.RequestBody
import javax.inject.Inject

class TimetableDataSourceImpl @Inject constructor(
    private val apiService: APIService
) : TimetableDataSource {

    override suspend fun getTimetable(postData: RequestBody): TimetableResponse {
        return apiService.apiTimetable(postData)
    }
}