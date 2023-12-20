package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.JsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.timetable.PostTimetableOneWayUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.timetable.PostTimetableRoundTripUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.oneway.TimetableOneWayResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip.TimetableRoundTripResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TimetableViewModel @Inject constructor(
    private val postTimetableOneWayUseCase: PostTimetableOneWayUseCase,
    private val postTimetableRoundTripUseCase: PostTimetableRoundTripUseCase
) : ViewModel() {

    private var timetableOneWay = MutableLiveData<TimetableOneWayResponse?>()
    val timetableOneWayData : LiveData<TimetableOneWayResponse?>
        get() = timetableOneWay

    fun getTimetableOneWayDetails(postData: JsonObject) = viewModelScope.launch(Dispatchers.IO) {
        try {
            timetableOneWay.postValue(postTimetableOneWayUseCase.execute(postData))
        }
        catch (e: Exception) {
            Log.e("TimetableViewModel", e.message.toString())
        }
    }

    private var timetableRoundTrip = MutableLiveData<TimetableRoundTripResponse?>()
    val timetableRoundTripData : LiveData<TimetableRoundTripResponse?>
        get() = timetableRoundTrip

    fun getTimetableRoundTripDetails(postData: JsonObject) = viewModelScope.launch(Dispatchers.IO) {
        try {
            timetableRoundTrip.postValue(postTimetableRoundTripUseCase.execute(postData))
        }
        catch (e: Exception) {
            Log.e("TimetableViewModel", e.message.toString())
        }
    }
}