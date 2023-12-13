package com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository

import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response.ReservationResponse
import org.json.JSONObject

interface ReservationRepository {

    suspend fun apiReservationDetail(postData: JSONObject): ReservationResponse?

}