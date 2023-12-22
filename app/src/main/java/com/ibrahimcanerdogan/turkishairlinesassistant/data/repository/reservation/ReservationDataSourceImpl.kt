package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.reservation

import com.ibrahimcanerdogan.turkishairlinesassistant.data.remote.APIService
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response.ReservationResponse
import okhttp3.RequestBody
import javax.inject.Inject

class ReservationDataSourceImpl @Inject constructor(
    private val apiService: APIService
) : ReservationDataSource {

    override suspend fun getReservationDetail(postData: RequestBody): ReservationResponse {
        return apiService.apiRetrieveReservationDetail(postData)
    }
}