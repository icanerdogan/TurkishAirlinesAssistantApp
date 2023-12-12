package com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository

import org.json.JSONObject

interface ReservationRepository {

    suspend fun apiReservationDetail(postData: JSONObject): String?

}