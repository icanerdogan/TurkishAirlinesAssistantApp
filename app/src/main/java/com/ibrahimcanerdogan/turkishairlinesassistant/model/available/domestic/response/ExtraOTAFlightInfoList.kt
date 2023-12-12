package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

data class ExtraOTAFlightInfoList(
    val StandbyIndicator: Boolean,
    val bookingPriceInfoType: BookingPriceInfoType,
    val extraOTASegmentInfoListType: ExtraOTASegmentInfoListType,
    val flightNumber: String,
    val isCodeShare: Boolean,
    val isDomestic: Boolean,
    val isElectronicTicketAvailable: Boolean,
    val isFullAvailable: Boolean,
    val isFullCodeShare: Boolean,
    val isFullInternational: Boolean,
    val isMarketable: Boolean,
    val isPureAnadoluJetFlight: Boolean,
    val miniRulesList: MiniRulesList
)