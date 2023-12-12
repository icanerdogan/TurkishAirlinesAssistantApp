package com.ibrahimcanerdogan.turkishairlinesassistant.model.reservation.response

data class Document(
    val BirthDate: String,
    val DocHolderFormattedName: DocHolderFormattedName,
    val DocHolderNationality: String,
    val DocID: String,
    val DocIssueCountry: String,
    val DocType: String,
    val Gender: String,
    val Remark: String
)