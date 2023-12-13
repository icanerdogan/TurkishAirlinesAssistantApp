package com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.CalculateRepository
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.CalculateFlightMilesResponse
import org.json.JSONObject
import javax.inject.Inject

class PostCalculateFlightMilesUseCase @Inject constructor(
    private val calculateRepository: CalculateRepository
) {

    suspend fun execute(postData: JSONObject) : CalculateFlightMilesResponse? {
        return calculateRepository.apiPostCalculateFlightMiles(postData)
    }
}