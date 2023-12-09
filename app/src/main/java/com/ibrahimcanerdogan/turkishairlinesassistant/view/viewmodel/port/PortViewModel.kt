package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.port

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostPortUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.json.JSONObject
import javax.inject.Inject

class PortViewModel @Inject constructor(
    private val postPortUseCase: PostPortUseCase
) : ViewModel() {

    private var port = MutableLiveData<String?>()
    val portData : LiveData<String?>
        get() = port
    fun getPortData(postData: JSONObject) = viewModelScope.launch(Dispatchers.IO) {
        try {
            port.postValue(postPortUseCase.execute(postData))
        }
        catch (e: Exception) {
            Log.e("PortViewModel", e.message.toString())
        }
    }

}