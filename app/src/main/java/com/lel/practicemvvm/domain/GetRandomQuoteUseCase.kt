package com.lel.practicemvvm.domain

import com.lel.practicemvvm.data.model.QuoteModel
import com.lel.practicemvvm.data.model.QuoteProvider
import javax.inject.Inject

class GetRandomQuoteUseCase @Inject constructor(
    private val quoteProvider: QuoteProvider
) {

    operator fun invoke(): QuoteModel? {
        val quotes = quoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            return quotes[quotes.indices.random()]
        }
        return null
    }

}