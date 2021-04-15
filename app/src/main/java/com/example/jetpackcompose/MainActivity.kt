package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountUp(viewModel = CountViewModel())
        }
    }
}

@Composable
fun CountUp(viewModel: CountViewModel) {
    val count by viewModel.count.observeAsState()

    Column {
        Text(
            text = count.toString()
        )
        Button(
            onClick = {
                viewModel.countUp()
            }
        ) {
            Text(
                text = "Count Up!"
            )
        }
    }
}