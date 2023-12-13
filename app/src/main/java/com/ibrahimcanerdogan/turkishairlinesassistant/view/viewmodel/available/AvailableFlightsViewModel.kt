package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.available

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.JsonObject
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostAvailableFlightsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AvailableFlightsViewModel @Inject constructor(
    private val postAvailableFlightsUseCase: PostAvailableFlightsUseCase
): ViewModel() {

    private var availableFlights = MutableLiveData<String>()
    val availableFlightsData : LiveData<String>
        get() = availableFlights
    fun getAvailableFlights(postData: JsonObject) = viewModelScope.launch(Dispatchers.IO) {
        try {
            availableFlights.postValue(postAvailableFlightsUseCase.execute(postData))
        }
        catch (e: Exception) {
            Log.e("AvailableFlightsViewModel", e.message.toString())
        }
    }
}