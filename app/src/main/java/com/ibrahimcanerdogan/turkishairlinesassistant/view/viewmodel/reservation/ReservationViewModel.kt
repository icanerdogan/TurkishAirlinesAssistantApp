package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.reservation

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostReservationUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response.ReservationResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import org.json.JSONObject
import javax.inject.Inject

@HiltViewModel
class ReservationViewModel @Inject constructor(
    private val postReservationUseCase: PostReservationUseCase
) : ViewModel() {

    private var reservation = MutableLiveData<ReservationResponse?>()
    val reservationData : LiveData<ReservationResponse?>
        get() = reservation

    fun getReservationDetailData(postData: JSONObject) = viewModelScope.launch(Dispatchers.IO) {
        try {
            reservation.postValue(postReservationUseCase.execute(postData))
        }
        catch (e: Exception) {
            Log.e("ReservationViewModel", e.message.toString())
        }
    }
}