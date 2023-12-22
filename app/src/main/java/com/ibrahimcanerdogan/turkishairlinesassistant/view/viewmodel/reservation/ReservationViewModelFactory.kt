package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.reservation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostReservationUseCase
import javax.inject.Inject

class ReservationViewModelFactory @Inject constructor(
    private val reservationUseCase: PostReservationUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ReservationViewModel(reservationUseCase) as T
    }
}