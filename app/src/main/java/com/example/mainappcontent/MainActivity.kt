package com.example.mainappcontent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.mainappcontent.ui.theme.MainAppContentTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainAppContentTheme()
        }
    }
}

@Composable
fun MainAppContentTheme () {
    var valorDoMeuTextField by remember {
            mutableStateOf("vai curintia")
    }
    TextField(value = valorDoMeuTextField, onValueChange = { valorDoMeuTextField = it} )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainAppContentTheme()
}