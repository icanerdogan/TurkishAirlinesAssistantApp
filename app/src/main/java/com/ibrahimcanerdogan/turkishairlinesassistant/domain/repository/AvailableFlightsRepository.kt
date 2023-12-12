package com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository

import com.google.gson.JsonObject

interface AvailableFlightsRepository {

    suspend fun apiPostAvailableFlights(postData: JsonObject): String?

}