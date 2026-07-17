package com.example.dailypulse.articles

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.parameter

class ArticlesService(private val httpClient: HttpClient) {
    private val country = "us"
    private val category = "business"
    private val apiKey = "d27b4eb21219486f838ac46a432d69ce"

    suspend fun fetchArticles(): List<ArticleRaw> {
        val response: ArticlesResponse = httpClient.get("https://newsapi.org/v2/top-headlines") {
            parameter("country", country)
            parameter("category", category)
            parameter("apiKey", apiKey)
        }.body()
        return response.articles
    }
}