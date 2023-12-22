package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.timetable.PostTimetableOneWayUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.timetable.PostTimetableRoundTripUseCase
import javax.inject.Inject

class TimetableViewModelFactory @Inject constructor(
    private val postTimetableOneWayUseCase: PostTimetableOneWayUseCase,
    private val postTimetableRoundTripUseCase: PostTimetableRoundTripUseCase
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return TimetableViewModel(postTimetableOneWayUseCase, postTimetableRoundTripUseCase) as T
    }
}