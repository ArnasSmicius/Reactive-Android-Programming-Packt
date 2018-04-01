package com.example.arnassmicius.financialStockRxJava

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class StockDataAdapter : RecyclerView.Adapter<StockUpdateViewHolder>() {
    private val data: MutableList<StockUpdate> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StockUpdateViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.stock_update_item, parent, false)
        return StockUpdateViewHolder(view)
    }

    override fun onBindViewHolder(holder: StockUpdateViewHolder, position: Int) {
        val stockUpdate = data[position]
        holder.setStockSymbol(stockUpdate.stockSymbol)
        holder.setPrice(stockUpdate.price)
        holder.setDate(stockUpdate.date)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun add (stockUpdate: StockUpdate) {
        data.add(stockUpdate)
        notifyItemInserted(data.size - 1)
    }
}