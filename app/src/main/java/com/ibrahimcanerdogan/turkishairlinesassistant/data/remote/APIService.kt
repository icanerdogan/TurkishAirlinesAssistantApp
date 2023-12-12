package com.ibrahimcanerdogan.turkishairlinesassistant.data.remote

import com.ibrahimcanerdogan.turkishairlinesassistant.BuildConfig
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.Headers
import retrofit2.http.POST

interface APIService {
    @Headers(
        "apisecret: ${BuildConfig.API_SECRET}",
        "Content-Type: application/json",
        "apikey: ${BuildConfig.API_KEY}"
    )
    @POST("calculateFlightMiles")
    suspend fun apiPostCalculateFlightMiles(@Body postData: RequestBody): String

    @Headers(
        "apisecret: ${BuildConfig.API_SECRET}",
        "Content-Type: application/json",
        "apikey: ${BuildConfig.API_KEY}"
    )
    @POST("getPortList")
    suspend fun apiPostPort(@Body postData: RequestBody): String

    @Headers(
        "apisecret: ${BuildConfig.API_SECRET}",
        "Content-Type: application/json",
        "apikey: ${BuildConfig.API_KEY}"
    )
    @POST("retrieveReservationDetail")
    suspend fun apiRetrieveReservationDetail(@Body postData: RequestBody): String

    @Headers(
        "apisecret: ${BuildConfig.API_SECRET}",
        "Content-Type: application/json",
        "apikey: ${BuildConfig.API_KEY}"
    )
    @POST("getAvailability")
    suspend fun apiAvailableFlights(@Body postData: RequestBody): String

    @Headers(
        "apisecret: ${BuildConfig.API_SECRET}",
        "Content-Type: application/json",
        "apikey: ${BuildConfig.API_KEY}"
    )
    @POST("getTimeTable")
    suspend fun apiTimetable(@Body postData: RequestBody): String

}