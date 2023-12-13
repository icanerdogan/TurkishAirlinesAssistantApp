package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.timetable

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.JsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostTimetableUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.TimetableResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TimetableViewModel @Inject constructor(
    private val postTimetableUseCase: PostTimetableUseCase
) : ViewModel() {

    private var timetable = MutableLiveData<TimetableResponse?>()
    val timetableData : LiveData<TimetableResponse?>
        get() = timetable

    fun getTimetableDetails(postData: JsonObject) = viewModelScope.launch(Dispatchers.IO) {
        try {
            timetable.postValue(postTimetableUseCase.execute(postData))
        }
        catch (e: Exception) {
            Log.e("TimetableViewModel", e.message.toString())
        }
    }
}