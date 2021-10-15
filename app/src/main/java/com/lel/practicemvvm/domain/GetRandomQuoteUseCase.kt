package com.lel.practicemvvm.domain

import com.lel.practicemvvm.data.model.QuoteModel
import com.lel.practicemvvm.data.model.QuoteProvider

class GetRandomQuoteUseCase {

    operator fun invoke(): QuoteModel? {
        val quotes = QuoteProvider.quotes
        if (!quotes.isNullOrEmpty()) {
            return quotes[quotes.indices.random()]
        }
        return null
    }

}