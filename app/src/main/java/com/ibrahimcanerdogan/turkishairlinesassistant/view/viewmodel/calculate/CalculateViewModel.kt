package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostCalculateFlightMilesUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.json.JSONObject


class CalculateViewModel(
    private val postCalculateFlightMilesUseCase: PostCalculateFlightMilesUseCase
): ViewModel() {

    private var flightMiles = MutableLiveData<String>()
    val flightMilesData : LiveData<String>
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