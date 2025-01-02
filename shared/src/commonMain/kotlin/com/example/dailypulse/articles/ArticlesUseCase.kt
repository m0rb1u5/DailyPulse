package com.example.dailypulse.articles

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.todayIn
import kotlinx.datetime.TimeZone
import kotlinx.datetime.daysUntil
import kotlinx.datetime.toLocalDateTime
import kotlin.math.abs

class ArticlesUseCase(private val articlesService: ArticlesService) {
    suspend fun getArticles(): List<Article> {
        val articlesRaw = articlesService.fetchArticles()
        return mapArticles(articlesRaw)
    }

    private fun mapArticles(articlesRaw: List<ArticleRaw>): List<Article> = articlesRaw.map { raw ->
        Article(
            title = raw.title,
            desc = raw.desc ?: "Click to find out more",
            date = getDaysAgoString(raw.date),
            imageUrl = raw.imageUrl
                ?: "https://archive.org/download/placeholder-image/placeholder-image.jpg",
        )
    }

    private fun getDaysAgoString(date: String): String {
        val today = Clock.System.todayIn(TimeZone.currentSystemDefault())
        val days = today.daysUntil(
            Instant.parse(date).toLocalDateTime(TimeZone.currentSystemDefault()).date
        )

        val result = when {
            abs(days) > 1 -> "${abs(days)} days ago"
            abs(days) == 1 -> "yesterday"
            else -> "today"
        }

        return result
    }
}
