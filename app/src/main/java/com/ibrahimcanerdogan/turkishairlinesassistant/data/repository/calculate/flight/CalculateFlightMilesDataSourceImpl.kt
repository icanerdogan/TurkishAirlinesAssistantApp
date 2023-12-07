package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight

import com.ibrahimcanerdogan.turkishairlinesassistant.data.remote.APIService
import okhttp3.RequestBody
import javax.inject.Inject

class CalculateFlightMilesDataSourceImpl @Inject constructor(
    private val apiService: APIService
) : CalculateFlightMilesDataSource {

    override suspend fun getCalculateFlightMiles(postData: RequestBody): String {
        return apiService.apiPostCalculateFlightMiles(postData)
    }
}