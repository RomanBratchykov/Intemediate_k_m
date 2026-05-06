package com.example.intermediate_k_m.di

import org.koin.dsl.module
import org.koin.plugin.module.dsl.single
import org.koin.plugin.module.dsl.viewModel
import  com.example.intermediate_k_m.data.about.AboutRepository
import  com.example.intermediate_k_m.data.about.Platform
import  com.example.intermediate_k_m.ui.about.AboutViewModel

val appModule = module {
    single<Platform>()
    single<AboutRepository>()
    viewModel<AboutViewModel>()
}