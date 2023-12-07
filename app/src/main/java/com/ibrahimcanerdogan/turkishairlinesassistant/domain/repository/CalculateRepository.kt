package com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository

import org.json.JSONObject

interface CalculateRepository {

    suspend fun apiPostCalculateFlightMiles(postData: JSONObject): String?
}