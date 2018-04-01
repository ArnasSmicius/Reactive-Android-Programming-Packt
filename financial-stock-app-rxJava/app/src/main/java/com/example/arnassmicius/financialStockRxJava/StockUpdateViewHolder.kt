package com.example.arnassmicius.financialStockRxJava

import android.support.v7.widget.RecyclerView
import android.text.format.DateFormat
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.stock_update_item.view.*
import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

class StockUpdateViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val stockSymbol: TextView = view.stock_item_symbol
    private val date: TextView = view.stock_item_date
    private val price: TextView = view.stock_item_price

    fun setStockSymbol(stockSymbol: String) {
        this.stockSymbol.text = stockSymbol
    }

    fun setPrice(price: BigDecimal) {
        this.price.text = PRICE_FORMAT.format(price.toFloat())
    }

    fun setDate(date: Date) {
        this.date.text = DateFormat.format("yyyy-MM-dd hh:mm", date)
    }

    companion object {
        private val PRICE_FORMAT = DecimalFormat("#0.00")
    }
}