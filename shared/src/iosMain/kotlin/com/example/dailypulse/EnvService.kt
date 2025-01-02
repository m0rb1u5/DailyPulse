package com.example.dailypulse

import kotlinx.cinterop.ExperimentalForeignApi
import platform.Foundation.NSBundle
import platform.Foundation.NSString
import platform.Foundation.NSUTF8StringEncoding
import platform.Foundation.stringWithContentsOfFile

actual class EnvService actual constructor() {
    @OptIn(ExperimentalForeignApi::class)
    private val envMap: Map<String, String> by lazy {
        val path = NSBundle.mainBundle.pathForResource("shared/.env", null)
        val content = path?.let { NSString.stringWithContentsOfFile(it, NSUTF8StringEncoding, null) }
        content?.split("\n")?.associate {
            val (key, value) = it.split("=")
            key.trim() to value.trim()
        } ?: emptyMap()
    }

    actual fun getEnv(key: String): String? = envMap[key]
}