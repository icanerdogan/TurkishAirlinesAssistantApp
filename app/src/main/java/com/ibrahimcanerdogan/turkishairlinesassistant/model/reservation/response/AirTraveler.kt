package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class AirTraveler(
    val AccompaniedByInfantInd: Boolean,
    val Comment: CommentX,
    val CustLoyalty: CustLoyalty,
    val Document: List<Document>,
    val Email: Email,
    val Gender: String,
    val GroupInd: Boolean,
    val PassengerTypeCode: String,
    val PassengerTypeQuantity: PassengerTypeQuantity,
    val PersonName: PersonName,
    val ProfileRef: ProfileRef,
    val Telephone: Telephone
) : Parcelable