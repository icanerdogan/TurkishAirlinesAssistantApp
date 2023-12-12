package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

data class ExtraOTAAvailabilityInfoList(
    val RPH: String,
    //val extraOTAFlightInfoListType: ExtraOTAFlightInfoListType,
    val isAllFlightsFullCodeShare: Boolean,
    val isIndeedHasMoreFlightsForAnotherPortInTheSameCity: Boolean
)