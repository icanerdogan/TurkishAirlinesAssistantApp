package com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.timetable

import com.google.gson.JsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.TimetableRepository
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip.TimetableRoundTripResponse
import javax.inject.Inject

class PostTimetableRoundTripUseCase @Inject constructor(
    private val timetableRepository: TimetableRepository
) {

    suspend fun execute(postData: JsonObject) : TimetableRoundTripResponse? {
        return timetableRepository.apiTimetableRoundTrip(postData)
    }
}