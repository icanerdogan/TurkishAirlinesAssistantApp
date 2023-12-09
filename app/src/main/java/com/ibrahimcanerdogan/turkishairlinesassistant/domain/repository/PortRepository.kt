package com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository

import org.json.JSONObject

interface PortRepository {

    suspend fun apiPort(postData: JSONObject): String?

}