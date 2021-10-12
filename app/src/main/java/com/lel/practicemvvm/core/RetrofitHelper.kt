package com.lel.practicemvvm.core

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("http://localhost:8001")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}