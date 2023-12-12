package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.timetable

import com.ibrahimcanerdogan.turkishairlinesassistant.data.remote.APIService
import okhttp3.RequestBody
import javax.inject.Inject

class TimetableDataSourceImpl @Inject constructor(
    private val apiService: APIService
) : TimetableDataSource {

    override suspend fun getTimetable(postData: RequestBody): String {
        return apiService.apiTimetable(postData)
    }
}