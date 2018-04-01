package com.example.arnassmicius.financialStockRxJava.entities

import java.util.*

data class YahooStockQuery(
        val count: Int,
        val created: Date,
        val results: YahooStockResults
)