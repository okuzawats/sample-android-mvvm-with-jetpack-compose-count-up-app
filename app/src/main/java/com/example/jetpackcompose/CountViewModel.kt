package com.example.jetpackcompose

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CountViewModel {
    private val _count = MutableStateFlow<Int>(0)
    val count: StateFlow<Int> get() = _count

    fun countUp() {
        val currentValue = requireNotNull(_count.value)
        _count.value = currentValue + 1
    }
}