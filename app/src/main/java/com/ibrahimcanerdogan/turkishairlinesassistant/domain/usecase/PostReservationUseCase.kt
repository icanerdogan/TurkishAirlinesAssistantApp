package com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase

import com.ibrahimcanerdogan.turkishairlinesassistant.domain.repository.ReservationRepository
import org.json.JSONObject
import javax.inject.Inject

class PostReservationUseCase @Inject constructor(
    private val reservationRepository: ReservationRepository
) {
    suspend fun execute(postData: JSONObject) : String? {
        return reservationRepository.apiReservationDetail(postData)
    }
}