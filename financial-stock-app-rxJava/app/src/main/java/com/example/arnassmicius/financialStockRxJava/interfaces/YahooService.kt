package com.example.arnassmicius.financialStockRxJava.interfaces

import com.example.arnassmicius.financialStockRxJava.entities.YahooStockResult
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface YahooService {

    @GET("yql?format=json")
    fun yqlQuery(
            @Query("q") query: String,
            @Query("env") env: String
    ) : Single<YahooStockResult>

}