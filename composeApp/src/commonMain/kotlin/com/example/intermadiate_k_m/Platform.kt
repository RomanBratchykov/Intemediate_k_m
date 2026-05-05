package com.example.intermadiate_k_m

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform