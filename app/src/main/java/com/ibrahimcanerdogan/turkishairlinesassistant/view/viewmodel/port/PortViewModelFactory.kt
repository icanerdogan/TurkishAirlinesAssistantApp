package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.port

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostPortUseCase

class PortViewModelFactory(
    private val useCase: PostPortUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return PortViewModel(useCase) as T
    }
}