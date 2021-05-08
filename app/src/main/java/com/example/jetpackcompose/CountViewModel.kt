package com.example.jetpackcompose

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map

class CountViewModel : ViewModel() {
    private val _count = MutableStateFlow<Int>(0)
    val count: Flow<String> get() = _count.map { it.toString() }

    fun onCountUpTapped() {
        val currentValue = requireNotNull(_count.value)
        _count.value = currentValue + 1
    }
}