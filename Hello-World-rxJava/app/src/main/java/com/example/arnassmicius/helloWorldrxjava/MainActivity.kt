package com.example.arnassmicius.helloWorldrxjava

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import io.reactivex.Observable
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val layoutManager = LinearLayoutManager(this)
    private val stockDataAdapter = StockDataAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Observable.just("Hello! Please use this app responsibly!")
                .subscribe { hello_world_salute.text = it }

        stock_updates_recycler_view.setHasFixedSize(true)
        stock_updates_recycler_view.layoutManager = layoutManager
        stock_updates_recycler_view.adapter = stockDataAdapter

        Observable.just("APPL", "Google", "Twtr")
                .subscribe { stockDataAdapter.add(it) }
    }
}

// Psl 39
