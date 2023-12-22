package com.ibrahimcanerdogan.turkishairlinesassistant.view.viewmodel.calculate

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ibrahimcanerdogan.turkishairlinesassistant.domain.usecase.PostCalculateFlightMilesUseCase
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.CalculateFlightMilesResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.FlightMilesResponseDataDetail
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.json.JSONObject
import javax.inject.Inject

enum class CabinType(val type : String) {
    BUSINESS("Business"),
    ECONOMY("Economy")
}

@HiltViewModel
class CalculateViewModel @Inject constructor(
    private val postCalculateFlightMilesUseCase: PostCalculateFlightMilesUseCase
): ViewModel() {

    private var flightMiles = MutableLiveData<CalculateFlightMilesResponse>()
    val flightMilesData : LiveData<CalculateFlightMilesResponse>
        get() = flightMiles

    private var flightMilesBusiness = MutableLiveData<ArrayList<FlightMilesResponseDataDetail>>()
    val flightMilesBusinessData : LiveData<ArrayList<FlightMilesResponseDataDetail>>
        get() = flightMilesBusiness

    private var flightMilesEconomy = MutableLiveData<ArrayList<FlightMilesResponseDataDetail>>()
    val flightMilesEconomyData : LiveData<ArrayList<FlightMilesResponseDataDetail>>
        get() = flightMilesEconomy

    private var airportList = MutableLiveData<Array<String>>()
    val airportListData : LiveData<Array<String>>
        get() = airportList

    fun calculateFlightMiles(postData: JSONObject) = viewModelScope.launch(Dispatchers.IO) {
        try {
            flightMiles.postValue(postCalculateFlightMilesUseCase.execute(postData))
        }
        catch (e: Exception) {
            Log.e("CalculateViewModel", e.message.toString())
        }
    }

    fun calculateBusinessFlightMilesData(postData: JSONObject) = viewModelScope.launch(Dispatchers.IO) {
        try {
            val arrayBusinessFlight = arrayListOf<FlightMilesResponseDataDetail>()

            val postBusiness = postCalculateFlightMilesUseCase.execute(postData)

            postBusiness?.flightMilesResponseData?.flightMilesResponseDataDetail?.forEach {
                if (it.flightMilesDetailCabinType == CabinType.BUSINESS.type) {
                    arrayBusinessFlight.add(it)
                }
            }

            flightMilesBusiness.postValue(arrayBusinessFlight)
        }
        catch (e: Exception) {
            Log.e("CalculateViewModel", e.message.toString())
        }
    }

    fun calculateEconomyFlightMilesData(postData: JSONObject) = viewModelScope.launch(Dispatchers.IO) {
        try {
            val arrayEconomyFlight = arrayListOf<FlightMilesResponseDataDetail>()

            val postEconomy = postCalculateFlightMilesUseCase.execute(postData)

            postEconomy?.flightMilesResponseData?.flightMilesResponseDataDetail?.forEach {
                if (it.flightMilesDetailCabinType == CabinType.ECONOMY.type) {
                    arrayEconomyFlight.add(it)
                }
            }

            flightMilesEconomy.postValue(arrayEconomyFlight)
        }
        catch (e: Exception) {
            Log.e("CalculateViewModel", e.message.toString())
        }
    }

    fun getAirportsList() = viewModelScope.launch(Dispatchers.IO) {
        try {
            var airports = arrayOf<String>()
            val airportsList = airports.toMutableList()

            postCalculateFlightMilesUseCase.execute()?.forEach { item ->
                airportsList.add("${item.airportIataCode} - ${item.airportName}")
            }
            airports = airportsList.toTypedArray()

            airportList.postValue(airports)
        }
        catch (e: Exception) {
            Log.e("CalculateViewModel", e.message.toString())
        }
    }

}