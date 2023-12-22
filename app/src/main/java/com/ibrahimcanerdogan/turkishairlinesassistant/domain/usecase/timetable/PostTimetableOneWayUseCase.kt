package com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.timetable

import com.google.gson.JsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.TimetableRepository
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.oneway.TimetableOneWayResponse
import javax.inject.Inject

class PostTimetableOneWayUseCase @Inject constructor(
    private val timetableRepository: TimetableRepository
) {

    suspend fun execute(postData: JsonObject) : TimetableOneWayResponse? {
        return timetableRepository.apiTimetableOneWay(postData)
    }
}