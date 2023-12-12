package com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase

import com.google.gson.JsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.AvailableFlightsRepository
import javax.inject.Inject

class PostAvailableFlightsUseCase @Inject constructor(
    private val availableFlightsRepository: AvailableFlightsRepository
) {

    suspend fun execute(postData: JsonObject) : String? {
        return availableFlightsRepository.apiPostAvailableFlights(postData)
    }
}