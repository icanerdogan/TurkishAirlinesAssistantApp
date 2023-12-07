package com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.CalculateRepository
import org.json.JSONObject

class PostCalculateFlightMilesUseCase(
    private val calculateRepository: CalculateRepository
) {

    suspend fun execute(postData: JSONObject) : String? {
        return calculateRepository.apiPostCalculateFlightMiles(postData)
    }
}