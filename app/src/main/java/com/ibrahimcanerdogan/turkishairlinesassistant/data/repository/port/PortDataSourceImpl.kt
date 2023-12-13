package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.port

import com.ibrahimcanerdogan.turkishairlinesassistant.data.remote.APIService
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response.PortResponse
import okhttp3.RequestBody
import javax.inject.Inject

class PortDataSourceImpl @Inject constructor(
    private val apiService: APIService
) : PortDataSource {

    override suspend fun getPort(postData: RequestBody): PortResponse {
        return apiService.apiPostPort(postData)
    }

}