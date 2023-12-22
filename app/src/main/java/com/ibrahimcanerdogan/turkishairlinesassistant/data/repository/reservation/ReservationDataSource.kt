package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.reservation

import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response.ReservationResponse
import okhttp3.RequestBody

interface ReservationDataSource {

    suspend fun getReservationDetail(postData: RequestBody) : ReservationResponse

}