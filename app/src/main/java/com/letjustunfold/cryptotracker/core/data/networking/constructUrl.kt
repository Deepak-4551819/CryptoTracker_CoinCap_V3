package com.letjustunfold.cryptotracker.core.data.networking

fun constructUrl(url: String): String {
    val sanitized = url.trim()
    return when {
        sanitized.contains(BASE_URL) -> sanitized
        sanitized.startsWith("/") -> BASE_URL + sanitized.drop(1)
        else -> BASE_URL + sanitized
    }
}

const val BASE_URL = "https://rest.coincap.io/v3/"
