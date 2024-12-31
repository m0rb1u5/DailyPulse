package com.example.dailypulse

expect class EnvService {
    fun getEnv(key: String): String?
}
