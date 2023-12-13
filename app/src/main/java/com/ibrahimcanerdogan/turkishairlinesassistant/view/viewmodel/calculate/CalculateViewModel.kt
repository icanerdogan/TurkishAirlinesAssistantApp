package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostCalculateFlightMilesUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.CalculateFlightMilesResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.json.JSONObject
import javax.inject.Inject

@HiltViewModel
class CalculateViewModel @Inject constructor(
    private val postCalculateFlightMilesUseCase: PostCalculateFlightMilesUseCase
): ViewModel() {

    private var flightMiles = MutableLiveData<CalculateFlightMilesResponse>()
    val flightMilesData : LiveData<CalculateFlightMilesResponse>
        get() = flightMiles
    fun calculateFlightMiles(postData: JSONObject) = viewModelScope.launch(Dispatchers.IO) {
        try {
            flightMiles.postValue(postCalculateFlightMilesUseCase.execute(postData))
        }
        catch (e: Exception) {
            Log.e("CalculateViewModel", e.message.toString())
        }
    }
}