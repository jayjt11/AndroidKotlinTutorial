package com.expleo.androidkotlintutorial

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity :AppCompatActivity() {


    lateinit var txtMsgReceived : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        txtMsgReceived = findViewById(R.id.txtMsgReceived)

        var name   = intent.getStringExtra("name")!!

        txtMsgReceived.text = name


    }
}