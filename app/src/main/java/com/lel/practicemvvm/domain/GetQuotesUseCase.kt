package com.lel.practicemvvm.domain

import com.lel.practicemvvm.data.QuoteRepository
import com.lel.practicemvvm.data.model.QuoteModel
import javax.inject.Inject

class GetQuotesUseCase @Inject constructor(
    private val repository : QuoteRepository
) {

    suspend operator fun invoke(): List<QuoteModel>? =
        repository.getAllQuotes()
}