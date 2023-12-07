package com.zwang.jetpackcompose

import android.content.res.Resources.Theme
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Greeting(message = Message("Zhen Wang", "World No.1"))
        }
    }

    @Composable
    fun Greeting(message: Message) {
        Column(
            modifier = Modifier
                .padding(all = 12.dp)
                .background(Color.Blue)
                .border(5.dp, Color.Red)
                .padding(all = 10.dp)
        ) {
            Text(text = "Hello ${message.author}!", fontSize = 14.sp)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = message.body)
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun GreetingPreview() {
        Greeting(Message("Android", "Zhen Wang"))
    }
}

data class Message(val author: String, val body: String)