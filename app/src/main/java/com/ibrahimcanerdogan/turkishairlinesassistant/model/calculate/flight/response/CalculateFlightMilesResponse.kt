package com.ibrahimcanerdogan.turkishairlinesassistant.model.calculate.flight.response

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class CalculateFlightMilesResponse(
    @SerializedName("data")
    val flightMilesResponseData: FlightMilesResponseData?,
    @SerializedName("message")
    val flightMilesResponseMessage: FlightMilesResponseMessage,
    @SerializedName("requestId")
    val flightMilesRequestId: String,
    @SerializedName("status")
    val flightMilesStatus: String
) : Parcelable

/*
{
    "status" : "SUCCESS",
    "requestId": "000001862bb34a15-11112c341",
    "message" : {
    "code" : "TK-0000",
    "description" : "Request Processed Successfully."
},
    "data" : {"milesResponseDetail":{"promoPoints":"0","promoMiles":"0","baseMiles":"3309","basePoint":"0","definition":"IST-DSS (Economy: H)","classCodes":"H","flightCount":"1","totalMiles":"3309","cabinType":"Economy"}}
}
*/

/*
{
    "status": "Failure",
    "requestId": "000001862bb34a15-111198810",
    "message":
    {
        "code": "TK-CRM-00000",
        "description": "Invalid Request Header"
    },
    "data":{}
}
*/

