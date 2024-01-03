package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.port

import com.ibrahimcanerdogan.turkishairlinesassistant.data.remote.APIService
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response.PortResponse
import okhttp3.RequestBody
import javax.inject.Inject

class PortDataSourceImpl @Inject constructor(
    private val apiService: APIService
) : PortDataSource {

    override suspend fun getPortAnadoluJet(postData: RequestBody): PortResponse {
        return apiService.apiPostAnadoluJetPort(postData)
    }

    override suspend fun getPortTurkishAirlines(): PortResponse {
        return apiService.apiPostTurkishAirlinesPort()
    }

}