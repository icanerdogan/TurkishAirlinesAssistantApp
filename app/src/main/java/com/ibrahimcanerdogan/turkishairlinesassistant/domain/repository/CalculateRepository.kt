package com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository

import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.CalculateFlightMilesResponse
import org.json.JSONObject

interface CalculateRepository {

    suspend fun apiPostCalculateFlightMiles(postData: JSONObject): CalculateFlightMilesResponse?
}