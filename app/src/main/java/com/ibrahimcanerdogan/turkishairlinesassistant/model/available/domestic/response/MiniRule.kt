package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

data class MiniRule(
    val BrandCode: String,
    val BrandKey: String,
    val BusinessLounge: String,
    val CarryOnBaggageAllowance: CarryOnBaggageAllowance,
    val CheckedBaggageAllowance: CheckedBaggageAllowance,
    val MealCommercialName: String,
    val MealSubCode: String,
    val PassengerType: String,
    val PenaltyMiniRule: PenaltyMiniRule,
    val RPH: String
)