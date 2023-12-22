package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostCalculateFlightMilesUseCase
import javax.inject.Inject

class CalculateViewModelFactory @Inject constructor(
    private val postCalculateFlightMilesUseCase: PostCalculateFlightMilesUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return CalculateViewModel(postCalculateFlightMilesUseCase) as T
    }
}