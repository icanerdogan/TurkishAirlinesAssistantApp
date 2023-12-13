package com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase

import com.google.gson.JsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.TimetableRepository
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.TimetableResponse
import javax.inject.Inject

class PostTimetableUseCase @Inject constructor(
    private val timetableRepository: TimetableRepository
) {

    suspend fun execute(postData: JsonObject) : TimetableResponse? {
        return timetableRepository.apiTimetable(postData)
    }
}