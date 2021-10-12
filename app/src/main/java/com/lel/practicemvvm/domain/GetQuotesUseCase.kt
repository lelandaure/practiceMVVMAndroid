package com.lel.practicemvvm.domain

import com.lel.practicemvvm.data.QuoteRepository
import com.lel.practicemvvm.data.model.QuoteModel

class GetQuotesUseCase {

    private val repository = QuoteRepository()

    suspend operator fun invoke(): List<QuoteModel>? = repository.getAllQuotes()
}