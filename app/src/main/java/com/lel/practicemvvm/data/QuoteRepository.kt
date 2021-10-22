package com.lel.practicemvvm.data

import com.lel.practicemvvm.data.model.QuoteModel
import com.lel.practicemvvm.data.model.QuoteProvider
import com.lel.practicemvvm.data.network.QuoteService
import javax.inject.Inject

class QuoteRepository @Inject constructor(
    private val api: QuoteService,
    private val quoteProvider: QuoteProvider
) {

    suspend fun getAllQuotes(): List<QuoteModel> {
        val response = api.getQuotes()
        quoteProvider.quotes = response
        return response
    }
}