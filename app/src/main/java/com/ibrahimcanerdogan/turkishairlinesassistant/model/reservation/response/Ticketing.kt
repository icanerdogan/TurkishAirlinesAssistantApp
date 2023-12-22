package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Ticketing(
    val CancelOnExpiryInd: Boolean,
    val FlightSegmentRefNumber: String,
    val MiscTicketingCode: String,
    val PseudoCityCode: String,
    val TicketDocumentNbr: String,
    val TicketType: String,
    val TravelerRefNumber: String
) : Parcelable