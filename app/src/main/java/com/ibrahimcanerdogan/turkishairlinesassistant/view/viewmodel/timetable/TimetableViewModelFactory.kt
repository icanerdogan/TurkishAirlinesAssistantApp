package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostTimetableUseCase
import javax.inject.Inject

class TimetableViewModelFactory @Inject constructor(
    private val postTimetableUseCase: PostTimetableUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TimetableViewModel(postTimetableUseCase) as T
    }
}