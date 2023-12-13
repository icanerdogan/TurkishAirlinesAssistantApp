package com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.ReservationRepository
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response.ReservationResponse
import org.json.JSONObject
import javax.inject.Inject

class PostReservationUseCase @Inject constructor(
    private val reservationRepository: ReservationRepository
) {
    suspend fun execute(postData: JSONObject) : ReservationResponse? {
        return reservationRepository.apiReservationDetail(postData)
    }
}