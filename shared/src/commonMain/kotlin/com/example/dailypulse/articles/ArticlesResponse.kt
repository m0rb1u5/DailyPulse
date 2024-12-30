package com.example.dailypulse.articles

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ArticlesResponse(
    val status: String,
    @SerialName("totalResults")
    val results: Int,
    val articles: List<ArticleRaw>
    )
