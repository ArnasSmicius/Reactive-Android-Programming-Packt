package com.example.arnassmicius.financialStockRxJava.entities

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class YahooStockQuote(
        val symbol: String,

        @SerializedName("Name") val name: String,
        @SerializedName("LastTradePriceOnly") val lastTradePriceOnly: BigDecimal,
        @SerializedName("DaysLow") val daysLow: BigDecimal,
        @SerializedName("DaysHigh") val daysHigh: BigDecimal,
        @SerializedName("Volume") val volume: String
)