package com.expleo.androidkotlintutorial.network

import com.expleo.androidkotlintutorial.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class NetworkUtil() {

    fun getRetrofit() : Retrofit {

        val retrofit = Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        return retrofit

    }
}
