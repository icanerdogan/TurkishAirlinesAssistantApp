package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AirReservation(
    val ArrangerInfo: ArrangerInfo,
    val BookingReferenceID: List<BookingReferenceID>,
    val CreateDateTime: String,
    val Fulfillment: Fulfillment,
    val PricingOverview: PricingOverview,
    val Ticketing: Ticketing,
    val TravelerInfo: TravelerInfo
) : Parcelable