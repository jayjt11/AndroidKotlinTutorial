package com.expleo.androidkotlintutorial

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.expleo.androidkotlintutorial.util.Util

class FirstActivity : AppCompatActivity(), View.OnClickListener {

    var myName : String = "Jayant Tiwari"
    val myManagerName  = "Saket Newaskar"

    val TAG = FirstActivity::class.java.simpleName

    lateinit var txtMsg : TextView
    lateinit var btnNext : Button

    lateinit var sharedPreferences : SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        sharedPreferences = this.getSharedPreferences("MY_APP", Context.MODE_PRIVATE)

        var editor = sharedPreferences.edit()

        editor.putString("myName", "Vaibhav")
        editor.commit()

        txtMsg = findViewById(R.id.txtMsg)
        btnNext = findViewById(R.id.btnNext)
        btnNext.setOnClickListener(this)

    }

    override fun onClick(view: View?) {

        if (view != null) {
            if (view.id == R.id.btnNext) {

                Util.showMessage(this)

                var myName = sharedPreferences.getString("myName", "")

//                println("My Name is $myName")
//                println("My Name is " +myName)
//                Log.d(TAG, "My Name is " +myName)

                val intent = Intent(this, SecondActivity::class.java)
                intent.putExtra("name", "Welcome to Kotlin")
                startActivity(intent)
            }


        }
    }

    override fun onPause() {
        super.onPause()
    }
}