package com.ibrahimcanerdogan.turkishairlinesassistant.data.repository.reservation

import okhttp3.RequestBody

interface ReservationDataSource {

    suspend fun getReservationDetail(postData: RequestBody) : String

}