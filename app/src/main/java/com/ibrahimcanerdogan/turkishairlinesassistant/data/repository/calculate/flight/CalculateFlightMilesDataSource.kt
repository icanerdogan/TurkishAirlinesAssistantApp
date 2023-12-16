package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.calculate.flight

import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.airport.AirportResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.CalculateFlightMilesResponse
import okhttp3.RequestBody

interface CalculateFlightMilesDataSource {

    suspend fun getCalculateFlightMiles(postData: RequestBody) : CalculateFlightMilesResponse?

    suspend fun getAirports() : AirportResponse?

}