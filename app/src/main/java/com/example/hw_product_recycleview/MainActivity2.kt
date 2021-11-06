package com.example.hw_product_recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.hw_product_recycleview.adapter.itemAdapter
import com.example.hw_product_recycleview.data.DataSource

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val myDataset = DataSource().loadMobile()
        val recyclerView = findViewById<RecyclerView>(R.id.recycle_n)
        recyclerView.adapter = itemAdapter(this,myDataset)

        recyclerView.setHasFixedSize(true)

        print("")
    }
}