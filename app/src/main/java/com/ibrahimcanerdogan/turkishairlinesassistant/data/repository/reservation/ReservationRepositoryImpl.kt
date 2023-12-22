package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.reservation

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.ReservationRepository
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response.ReservationResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import org.json.JSONObject
import javax.inject.Inject

class ReservationRepositoryImpl @Inject constructor(
    private val reservationDataSource: ReservationDataSource
) : ReservationRepository {

    override suspend fun apiReservationDetail(postData: JSONObject): ReservationResponse? {
        val jsonMediaType = "application/json; charset=utf-8".toMediaType()
        val requestBody = postData.toString().toRequestBody(jsonMediaType)

        return withContext(Dispatchers.IO) {
            try {
                reservationDataSource.getReservationDetail(requestBody)
            } catch (e: Exception) {
                e.printStackTrace()
                null
            }
        }
    }
}