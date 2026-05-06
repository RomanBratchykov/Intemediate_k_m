package com.example.intermediate_k_m

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import  com.example.intermediate_k_m.di.initKoin
import  com.example.intermediate_k_m.ui.root.AppScaffold
fun main() = application {
    initKoin { printLogger() }
    Window(
        onCloseRequest = ::exitApplication,
        title = "Intermadiate_k_m",
    ) {
        AppScaffold()
    }
}