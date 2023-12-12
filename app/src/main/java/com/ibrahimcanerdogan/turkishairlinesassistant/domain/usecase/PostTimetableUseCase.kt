package com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase

import com.google.gson.JsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.TimetableRepository
import javax.inject.Inject

class PostTimetableUseCase @Inject constructor(
    private val timetableRepository: TimetableRepository
) {

    suspend fun execute(postData: JsonObject) : String? {
        return timetableRepository.apiTimetable(postData)
    }
}