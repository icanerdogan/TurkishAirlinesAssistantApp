package com.ibrahimcanerdogan.turkishairlinesassistant.model.available.domestic.response

data class ExtraOTASegmentInfo(
    val isAnadoluJetSegment: Boolean,
    val isAvailable: Boolean,
    val isConnected: Boolean,
    val isDomestic: Boolean,
    val isStandBySeat: Boolean,
    val segmentIndex: String
)