package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.available

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostAvailableFlightsUseCase
import javax.inject.Inject

class AvailableFlightsViewModelFactory @Inject constructor(
    private val postAvailableFlightsUseCase: PostAvailableFlightsUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return AvailableFlightsViewModel(postAvailableFlightsUseCase) as T
    }
}