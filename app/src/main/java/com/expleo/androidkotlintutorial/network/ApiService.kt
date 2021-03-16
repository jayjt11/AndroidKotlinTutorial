package com.expleo.androidkotlintutorial.network

import com.expleo.androidkotlintutorial.model.User
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {

    //    https://jsonplaceholder.typicode.com/todos/1
    @GET("todos/1")
    fun getDOTOData(): Call<User>

}