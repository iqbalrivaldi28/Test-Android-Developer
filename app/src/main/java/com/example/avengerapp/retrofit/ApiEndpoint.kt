package com.example.avengerapp.retrofit

import com.example.avengerapp.data.MainModel
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {

    @GET("data.php")
        fun getData(): Call<MainModel>
}