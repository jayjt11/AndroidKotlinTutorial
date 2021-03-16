package com.expleo.androidkotlintutorial

import android.os.Build
import android.os.Bundle
import android.os.StrictMode
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.expleo.androidkotlintutorial.model.User
import com.expleo.androidkotlintutorial.network.ApiService
import com.expleo.androidkotlintutorial.network.NetworkUtil
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class NetworkActivity : AppCompatActivity() {

    lateinit var btnNext : Button
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        btnNext = findViewById(R.id.btnNext)

        btnNext.setOnClickListener {

            println("Button Clicked")
            var apiclass = NetworkUtil().getRetrofit().create(ApiService::class.java)

             var users = apiclass.getDOTOData()

            users.enqueue(object : Callback<User> {
                override fun onResponse(call: Call<User>, response: Response<User>) {

                    println("My Response $ " + call.request().url())

                    var myResponse = response.body()
                    var title : String = myResponse.title
                    println("My Response $title")


                }

                override fun onFailure(call: Call<User>, t: Throwable) {
                    println("My Response $ " + call.request().url())
                    Toast.makeText(applicationContext, "Failed", Toast.LENGTH_LONG).show()
                }
            })
        }
    }

}