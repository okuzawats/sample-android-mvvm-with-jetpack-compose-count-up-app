package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue

class MainActivity : ComponentActivity() {
    private val viewModel: CountViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountUp(viewModel = viewModel)
        }
    }
}

@Composable
fun CountUp(viewModel: CountViewModel) {
    val count: Int by viewModel.count

    Column {
        Text(
            text = "$count"
        )
        Button(
            onClick = {
                viewModel.onCountUpTapped()
            }
        ) {
            Text(
                text = "Count Up!"
            )
        }
    }
}