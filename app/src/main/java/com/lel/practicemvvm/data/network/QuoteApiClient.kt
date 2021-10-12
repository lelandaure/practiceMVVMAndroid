package com.lel.practicemvvm.data.network

import com.lel.practicemvvm.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApiClient {
    @GET("/quotes")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}