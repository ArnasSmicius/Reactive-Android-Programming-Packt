package com.example.arnassmicius.helloWorldrxjava

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class StockDataAdapter : RecyclerView.Adapter<StockUpdateViewHolder>() {
    private val data: MutableList<String> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StockUpdateViewHolder {
        val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.view_holder_stock_update, parent, false)
        return StockUpdateViewHolder(view)
    }

    override fun onBindViewHolder(holder: StockUpdateViewHolder, position: Int) {
        holder.stockSymbol.text = data.get(position)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    fun add (stockSymbol: String) {
        data.add(stockSymbol)
        notifyItemInserted(data.size - 1)
    }
}