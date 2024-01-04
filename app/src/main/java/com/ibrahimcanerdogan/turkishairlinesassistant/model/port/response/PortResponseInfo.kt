package com.ibrahimcanerdogan.turkishairlinesassistant.model.port.response

import com.google.gson.annotations.SerializedName
import java.util.UUID

data class PortResponseInfo(
    val portResponseInfoID: String = UUID.randomUUID().toString(),
    //@SerializedName("City")
    //val portResponseInfoCity: PortCity,
    @SerializedName("Code")
    val portResponseInfoCode: String,
    // @SerializedName("Coordinate")
    // val portResponseInfoCoordinate: PortCoordinate,
    // @SerializedName("Country")
    // val portResponseInfoCountry: PortCountry,
    @SerializedName("HasComfort")
    val portResponseInfoHasComfort: Boolean,
    @SerializedName("IsDomestic")
    val portResponseInfoIsDomestic: Boolean,
    @SerializedName("IsSPA")
    val portResponseInfoIsSPA: Boolean,
    @SerializedName("IsSPAArrival")
    val portResponseInfoIsSPAArrival: Boolean,
    @SerializedName("IsWebsAgent")
    val portResponseInfoIsWebsAgent: Boolean,
    // @SerializedName("LanguageInfo")
    // val portResponseInfoLanguageInfo: PortBaseLanguageList,
    // @SerializedName("PortTag")
    // val portResponseInfoTag: PortTag,
    // @SerializedName("Region")
    // val portResponseInfoRegion: PortRegion,
    @SerializedName("portType")
    val portResponseInfoType: String,
    @SerializedName("validForAwardTicket")
    val portResponseInfoValidForAwardTicket: Boolean,
    @SerializedName("validForStarAwardTicket")
    val portResponseInfoValidForStarAwardTicket: Boolean
)