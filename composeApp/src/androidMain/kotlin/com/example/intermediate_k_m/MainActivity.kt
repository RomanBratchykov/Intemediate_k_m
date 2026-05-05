package com.example.intermediate_k_m

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.intermediate_k_m.ui.root.AppScaffold
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)

        setContent {
            AppScaffold()
        }
    }
}

@Preview
@Composable
fun AppAndroidPreview() {
    AppScaffold()
}