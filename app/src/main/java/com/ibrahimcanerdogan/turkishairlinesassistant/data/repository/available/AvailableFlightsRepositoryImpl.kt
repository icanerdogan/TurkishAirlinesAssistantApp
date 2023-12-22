package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.available

import com.google.gson.JsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.AvailableFlightsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import javax.inject.Inject

class AvailableFlightsRepositoryImpl @Inject constructor(
    private val availableFlightsDataSource: AvailableFlightsDataSource
) : AvailableFlightsRepository {
    override suspend fun apiPostAvailableFlights(postData: JsonObject): String? {
        val jsonMediaType = "application/json; charset=utf-8".toMediaType()
        val requestBody = postData.toString().toRequestBody(jsonMediaType)

        return withContext(Dispatchers.IO) {
            try {
                availableFlightsDataSource.getAvailableFlights(requestBody)
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }
    }
}