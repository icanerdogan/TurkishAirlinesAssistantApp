package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.port

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.PortRepository
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response.PortResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import javax.inject.Inject

class PortRepositoryImpl @Inject constructor(
    private val portDataSource: PortDataSource
) : PortRepository {

    override suspend fun apiPortAnadoluJet(postData: JSONObject): PortResponse? {
        val jsonMediaType = "application/json; charset=utf-8".toMediaType()
        val requestBody = postData.toString().toRequestBody(jsonMediaType)

        return withContext(Dispatchers.IO) {
            try {
                portDataSource.getPortAnadoluJet(requestBody)
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }
    }

    override suspend fun apiPortTurkishAirlines(): PortResponse? = withContext(Dispatchers.IO) {
        try {
            portDataSource.getPortTurkishAirlines()
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }
}