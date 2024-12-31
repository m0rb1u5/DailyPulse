package com.example.dailypulse

import io.github.cdimascio.dotenv.dotenv

actual class EnvService {
    private val dotenv = dotenv {
        directory = "./"
        filename = ".env"
        ignoreIfMissing = true
    }

    actual fun getEnv(key: String): String? = dotenv[key]
}