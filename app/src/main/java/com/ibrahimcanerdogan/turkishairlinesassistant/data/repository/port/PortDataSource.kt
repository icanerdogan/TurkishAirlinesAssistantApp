package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.port

import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response.PortResponse
import okhttp3.RequestBody

interface PortDataSource {

    suspend fun getPortAnadoluJet(postData: RequestBody) : PortResponse

    suspend fun getPortTurkishAirlines() : PortResponse

}