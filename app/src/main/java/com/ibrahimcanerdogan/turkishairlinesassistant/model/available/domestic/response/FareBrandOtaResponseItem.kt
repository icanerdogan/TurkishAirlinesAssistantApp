package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

data class FareBrandOtaResponseItem(
    val BonusMile: Boolean,
    val BonusMileAmount: String,
    val BrandCode: String,
    val BrandIndex: String,
    val BrandKey: String,
    val BrandName: String,
    val CarrierCode: String,
    val SeatSelection: Boolean
)