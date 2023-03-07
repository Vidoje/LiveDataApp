package com.example.livedataapp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingNumber: Int) : ViewModel() {
    private var total = MutableLiveData<Int>()
    val totalSum: LiveData<Int>
        get() = total

    init {
        total.value = startingNumber
    }

    fun sumUP(input: Int) {
        total.value = (total.value)?.plus(input)
    }
}