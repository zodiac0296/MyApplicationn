package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.adapters.CustomAdapter
import com.example.myapplication.models.Pictures

class MainActivity : AppCompatActivity() {

    val array = arrayListOf("name","name","name","name","name")

    val Pictures = arrayListOf(Pictures("hz", R.drawable.hz),
        Pictures("башня",R.drawable.parish),
        Pictures("sdgsd",R.drawable.piramidy),
        Pictures("dsfs",R.drawable.ss),
        Pictures("dsfsdf",R.drawable.treugolnik),

   )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(Pictures)


    }
}