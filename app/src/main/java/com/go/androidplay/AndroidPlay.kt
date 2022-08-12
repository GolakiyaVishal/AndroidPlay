package com.go.androidplay

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.go.androidplay.view.RecyclerItemListAdapter
import com.go.androidplay.viewmodel.ItemClickInterface

class AndroidPlay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val itemAdapter = RecyclerItemListAdapter()
        val onItemClick = object : ItemClickInterface {
            override fun onClick() {
                Toast.makeText(applicationContext, "Item clicked", Toast.LENGTH_SHORT).show()
            }
        }

        itemAdapter.setOnItemClickListener(onItemClick)

        val recyclerView = findViewById<RecyclerView>(R.id.postRecyclerList)
        val layoutManager : RecyclerView.LayoutManager = LinearLayoutManager(applicationContext)
        recyclerView.layoutManager = layoutManager
        recyclerView.itemAnimator = DefaultItemAnimator()
        recyclerView.adapter = itemAdapter
    }


}