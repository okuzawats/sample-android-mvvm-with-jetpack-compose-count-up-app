package com.example.jetpackcompose

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class CountViewModel {
    private val _count = MutableLiveData<Int>(0)
    val count: LiveData<Int> get() = _count

    fun countUp() {
        val currentValue = requireNotNull(_count.value)
        _count.value = currentValue + 1
    }
}