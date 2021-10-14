package com.lel.practicemvvm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://192.168.1.9:8001/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}