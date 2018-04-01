package com.example.arnassmicius.financialStockRxJava.entities

data class YahooStockResult(
        private val query: YahooStockQuery
) {
    fun getQuery(): YahooStockQuery {
        return query
    }
}