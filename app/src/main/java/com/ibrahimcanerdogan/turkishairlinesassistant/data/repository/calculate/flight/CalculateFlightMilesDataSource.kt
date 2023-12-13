package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight

import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.CalculateFlightMilesResponse
import okhttp3.RequestBody
import retrofit2.Response

interface CalculateFlightMilesDataSource {

    suspend fun getCalculateFlightMiles(postData: RequestBody) : CalculateFlightMilesResponse?

}