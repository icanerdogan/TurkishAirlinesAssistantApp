package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.timetable

import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.oneway.TimetableOneWayResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip.TimetableRoundTripResponse
import okhttp3.RequestBody

interface TimetableDataSource {

    suspend fun getTimetableOneWay(postData: RequestBody) : TimetableOneWayResponse

    suspend fun getTimetableRoundTrip(postData: RequestBody) : TimetableRoundTripResponse

}