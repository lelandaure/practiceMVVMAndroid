package com.lel.practicemvvm.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.lel.practicemvvm.data.model.QuoteModel
import com.lel.practicemvvm.data.model.QuoteProvider

class QuoteViewModel : ViewModel() {

    val quoteModel = MutableLiveData<QuoteModel>()

    fun randomQuote(){
        val currentQuote = QuoteProvider.random()
        quoteModel.postValue(currentQuote)
    }

}