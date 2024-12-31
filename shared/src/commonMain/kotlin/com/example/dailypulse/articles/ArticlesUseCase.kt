package com.example.dailypulse.articles

class ArticlesUseCase(private val articlesService: ArticlesService) {
    suspend fun getArticles(): List<Article> {
        val articlesRaw = articlesService.fetchArticles()
        return mapArticles(articlesRaw)
    }

    private fun mapArticles(articlesRaw: List<ArticleRaw>): List<Article> = articlesRaw.map { raw ->
        Article(
            title = raw.title,
            desc = raw.desc ?: "Click to find out more",
            date = raw.date,
            imageUrl = raw.imageUrl ?: "https://archive.org/download/placeholder-image/placeholder-image.jpg",
        )
    }
}
