package com.ibrahimcanerdogan.turkishairlinesassistant.model.timetable.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class FlightSegment(
    val ArrivalAirport: ArrivalAirport,
    val ArrivalDateTime: String,
    val DaysOfOperation: DaysOfOperation,
    val DepartureAirport: DepartureAirport,
    val DepartureDateTime: String,
    val Equipment: Equipment,
    val FlightNumber: String,
    val JourneyDuration: String,
    val MarketingAirline: MarketingAirline,
    val OperatingAirline: OperatingAirline,
    val RPH: String,
    val ScheduleValidEndDate: String,
    val ScheduleValidStartDate: String,
    val StopQuantity: String
) : Parcelable