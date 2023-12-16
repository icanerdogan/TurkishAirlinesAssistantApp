package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight

import com.ibrahimcanerdogan.turkishairlinesassistant.data.remote.APIService
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.airport.AirportResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.CalculateFlightMilesResponse
import okhttp3.RequestBody
import javax.inject.Inject

class CalculateFlightMilesDataSourceImpl @Inject constructor(
    private val apiService: APIService
) : CalculateFlightMilesDataSource {

    override suspend fun getCalculateFlightMiles(postData: RequestBody): CalculateFlightMilesResponse {
        return apiService.apiPostCalculateFlightMiles(postData)
    }

    override suspend fun getAirports(): AirportResponse? {
        return apiService.apiGetAirports()
    }
}