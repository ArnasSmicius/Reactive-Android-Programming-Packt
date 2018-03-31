package com.example.arnassmicius.helloWorldrxjava

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.view_holder_stock_update.view.*

class StockUpdateViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val stockSymbol: TextView = view.stock_item_symbol

}