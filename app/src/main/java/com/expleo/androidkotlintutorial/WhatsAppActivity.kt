package com.expleo.androidkotlintutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.expleo.androidkotlintutorial.adapter.WhatsappAdapter
import com.expleo.androidkotlintutorial.model.Whatsapp

class WhatsAppActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView

    var listItems = ArrayList<Whatsapp>()
    lateinit var adapter : WhatsappAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_whatsapp)

        recyclerView = findViewById(R.id.recycleWhatsapp)

        adapter = WhatsappAdapter(listItems)

        initArrayItems()

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter

    }

    fun initArrayItems() {

        listItems.add(Whatsapp("Saket Newaskar", "Manager"))
        listItems.add(Whatsapp("Jayant Tiwari", "Developer"))
        listItems.add(Whatsapp("Lokesh Kuruva", "Developer"))
        listItems.add(Whatsapp("Kajal Gaikwad", "Developer"))
        listItems.add(Whatsapp("Pallavi Patil", "Developer"))
        listItems.add(Whatsapp("Vaibhav Keware", "Developer"))
        listItems.add(Whatsapp("Imran Khan", "Developer"))
        listItems.add(Whatsapp("Tejaswi Kadam", "Developer"))

    }


}