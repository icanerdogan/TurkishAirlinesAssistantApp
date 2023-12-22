package com.ibrahimcanerdogan.turkishairlinesassistant.data.remote

import com.ibrahimcanerdogan.turkishairlinesassistant.BuildConfig
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.airport.AirportResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response.CalculateFlightMilesResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response.PortResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response.ReservationResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.oneway.TimetableOneWayResponse
import com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response.roundtrip.TimetableRoundTripResponse
import okhttp3.RequestBody
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.POST

interface APIService {
    @Headers(
        "apisecret: ${BuildConfig.API_SECRET}",
        "Content-Type: application/json",
        "apikey: ${BuildConfig.API_KEY}"
    )
    @POST("calculateFlightMiles")
    suspend fun apiPostCalculateFlightMiles(@Body postData: RequestBody): CalculateFlightMilesResponse

    @GET("https://raw.githubusercontent.com/icanerdogan/public-json-datasets/master/airports/airports.json")
    suspend fun apiGetAirports(): AirportResponse

    @Headers(
        "apisecret: ${BuildConfig.API_SECRET}",
        "Content-Type: application/json",
        "apikey: ${BuildConfig.API_KEY}"
    )
    @POST("getPortList")
    suspend fun apiPostPort(@Body postData: RequestBody): PortResponse

    @Headers(
        "apisecret: ${BuildConfig.API_SECRET}",
        "Content-Type: application/json",
        "apikey: ${BuildConfig.API_KEY}"
    )
    @POST("retrieveReservationDetail")
    suspend fun apiRetrieveReservationDetail(@Body postData: RequestBody): ReservationResponse

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
    suspend fun apiTimetableOneWay(@Body postData: RequestBody): TimetableOneWayResponse

    @Headers(
        "apisecret: ${BuildConfig.API_SECRET}",
        "Content-Type: application/json",
        "apikey: ${BuildConfig.API_KEY}"
    )
    @POST("getTimeTable")
    suspend fun apiTimetableRoundTrip(@Body postData: RequestBody): TimetableRoundTripResponse

}