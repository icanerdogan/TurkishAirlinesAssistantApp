package com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.PortRepository
import org.json.JSONObject

class PostPortUseCase(
    private val portRepository: PortRepository
) {

    suspend fun execute(postData: JSONObject) : String? {
        return portRepository.apiPort(postData)
    }
}