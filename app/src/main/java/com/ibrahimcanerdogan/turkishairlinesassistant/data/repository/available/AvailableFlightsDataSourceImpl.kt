package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.available

import com.ibrahimcanerdogan.turkishairlinesassistant.data.remote.APIService
import okhttp3.RequestBody
import javax.inject.Inject

class AvailableFlightsDataSourceImpl @Inject constructor(
    private val apiService: APIService
) : AvailableFlightsDataSource {

    override suspend fun getAvailableFlights(postData: RequestBody): String {
        return apiService.apiAvailableFlights(postData)
    }
}