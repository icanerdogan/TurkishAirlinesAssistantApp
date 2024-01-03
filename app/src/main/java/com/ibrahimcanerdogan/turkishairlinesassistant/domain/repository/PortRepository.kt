package com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository

import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response.PortResponse
import org.json.JSONObject

interface PortRepository {

    suspend fun apiPortAnadoluJet(postData: JSONObject): PortResponse?

    suspend fun apiPortTurkishAirlines(): PortResponse?

}