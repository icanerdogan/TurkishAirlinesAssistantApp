package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.timetable

import com.ibrahimcanerdogan.turkishairlinesassistant.data.remote.APIService
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.oneway.TimetableOneWayResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip.TimetableRoundTripResponse
import okhttp3.RequestBody
import javax.inject.Inject

class TimetableDataSourceImpl @Inject constructor(
    private val apiService: APIService
) : TimetableDataSource {

    override suspend fun getTimetableOneWay(postData: RequestBody): TimetableOneWayResponse {
        return apiService.apiTimetableOneWay(postData)
    }

    override suspend fun getTimetableRoundTrip(postData: RequestBody): TimetableRoundTripResponse {
        return apiService.apiTimetableRoundTrip(postData)
    }
}