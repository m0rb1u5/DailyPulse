package com.example.dailypulse.articles

import com.example.dailypulse.EnvService
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class ArticlesService(private val httpClient: HttpClient, private val envService: EnvService) {
    private val country = "br"
    private val category = "business"
    private val apiKey = envService.getEnv("API_KEY")

    suspend fun fetchArticles(): List<ArticleRaw> {
        val response: ArticlesResponse = httpClient.get("https://newsapi.org/v2/top-headlines") {
            parameter("country", country)
            parameter("category", category)
            parameter("apiKey", apiKey)
        }.body()
        return response.articles
    }
}