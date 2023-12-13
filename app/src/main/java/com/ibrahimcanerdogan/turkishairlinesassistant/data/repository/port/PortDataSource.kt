package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.port

import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response.PortResponse
import okhttp3.RequestBody

interface PortDataSource {

    suspend fun getPort(postData: RequestBody) : PortResponse

}