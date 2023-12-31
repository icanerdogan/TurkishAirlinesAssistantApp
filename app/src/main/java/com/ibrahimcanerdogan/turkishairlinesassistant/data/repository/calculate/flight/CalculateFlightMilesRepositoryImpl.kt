package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.CalculateRepository
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.airport.AirportResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.CalculateFlightMilesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import javax.inject.Inject

class CalculateFlightMilesRepositoryImpl @Inject constructor(
    private val calculateFlightMilesDataSource: CalculateFlightMilesDataSource
) : CalculateRepository {

    override suspend fun apiPostCalculateFlightMiles(postData: JSONObject): CalculateFlightMilesResponse? {
        val jsonMediaType = "application/json; charset=utf-8".toMediaType()
        val requestBody = postData.toString().toRequestBody(jsonMediaType)

        return withContext(Dispatchers.IO) {
            try {
                // Assuming the API returns a String directly
                calculateFlightMilesDataSource.getCalculateFlightMiles(requestBody)
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }
    }

    override suspend fun apiGetAirports(): AirportResponse? = withContext(Dispatchers.IO) {
        try {
            calculateFlightMilesDataSource.getAirports()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

}