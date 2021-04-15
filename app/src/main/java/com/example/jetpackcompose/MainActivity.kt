package com.example.jetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CountUp()
        }
    }
}

@Composable
fun CountUp() {
    var count: Int by remember {
        mutableStateOf(0)
    }

    Column {
        Text(
            text = count.toString()
        )
        Button(
            onClick = {
                count += 1
            }
        ) {
            Text(
                text = "Count Up!"
            )
        }
    }
}