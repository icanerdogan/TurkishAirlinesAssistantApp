package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.port

import okhttp3.RequestBody

interface PortDataSource {

    suspend fun getPort(postData: RequestBody) : String

}