package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.timetable

import com.google.gson.JsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.TimetableRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import javax.inject.Inject

class TimetableRepositoryImpl @Inject constructor(
    private val timetableDataSource: TimetableDataSource
) : TimetableRepository {

    override suspend fun apiTimetable(postData: JsonObject): String? {
        val jsonMediaType = "application/json; charset=utf-8".toMediaType()
        val requestBody = postData.toString().toRequestBody(jsonMediaType)

        return withContext(Dispatchers.IO) {
            try {
                timetableDataSource.getTimetable(requestBody)
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }
    }
}