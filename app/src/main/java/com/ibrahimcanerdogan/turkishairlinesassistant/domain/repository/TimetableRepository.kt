package com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository

import com.google.gson.JsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.oneway.TimetableOneWayResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip.TimetableRoundTripResponse

interface TimetableRepository {

    suspend fun apiTimetableOneWay(postData: JsonObject): TimetableOneWayResponse?

    suspend fun apiTimetableRoundTrip(postData: JsonObject): TimetableRoundTripResponse?

}