package com.example.intermadiate_k_m

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Intermadiate_k_m",
    ) {
        App()
    }
}