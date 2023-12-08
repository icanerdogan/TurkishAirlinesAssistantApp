package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight

import okhttp3.RequestBody

interface CalculateFlightMilesDataSource {

    suspend fun getCalculateFlightMiles(postData: RequestBody) : String

}