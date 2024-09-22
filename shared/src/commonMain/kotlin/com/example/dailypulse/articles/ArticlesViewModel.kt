package com.example.dailypulse.articles

import com.example.dailypulse.BaseViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class ArticlesViewModel : BaseViewModel() {
    private val _articlesState: MutableStateFlow<ArticlesState> = MutableStateFlow(ArticlesState())

    val articlesState: StateFlow<ArticlesState> get() = _articlesState
}