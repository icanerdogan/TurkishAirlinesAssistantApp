package com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.PortRepository
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response.PortResponse
import org.json.JSONObject
import javax.inject.Inject

class PostPortUseCase @Inject constructor(
    private val portRepository: PortRepository
) {

    suspend fun execute(postData: JSONObject) : PortResponse? {
        return portRepository.apiPort(postData)
    }
}