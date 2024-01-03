package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.port

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostPortUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response.PortResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.json.JSONObject
import javax.inject.Inject

@HiltViewModel
class PortViewModel @Inject constructor(
    private val postPortUseCase: PostPortUseCase
) : ViewModel() {

    private var portAnadoluJet = MutableLiveData<PortResponse?>()
    val portAnadoluJetData : LiveData<PortResponse?>
        get() = portAnadoluJet
    fun getPortAnadoluJetData(postData: JSONObject) = viewModelScope.launch(Dispatchers.IO) {
        try {
            portAnadoluJet.postValue(postPortUseCase.execute(postData))
        }
        catch (e: Exception) {
            Log.e("PortViewModel", e.message.toString())
        }
    }

    private var portTurkishAirlines = MutableLiveData<PortResponse?>()
    val portTurkishAirlinesData : LiveData<PortResponse?>
        get() = portTurkishAirlines
    fun getPortTurkishAirlinesData() = viewModelScope.launch(Dispatchers.IO) {
        try {
            portTurkishAirlines.postValue(postPortUseCase.execute())
        }
        catch (e: Exception) {
            Log.e("PortViewModel", e.message.toString())
        }
    }
}