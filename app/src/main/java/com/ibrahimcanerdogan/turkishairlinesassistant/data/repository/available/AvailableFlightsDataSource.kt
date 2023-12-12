package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.available

import okhttp3.RequestBody

interface AvailableFlightsDataSource {
    suspend fun getAvailableFlights(postData: RequestBody) : String

}