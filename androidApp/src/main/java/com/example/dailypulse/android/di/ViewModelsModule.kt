package com.example.dailypulse.android.di

import com.example.dailypulse.articles.ArticlesViewModel
import org.koin.core.module.dsl.viewModel
import org.koin.dsl.module

val viewModelsModule = module {
    viewModel { ArticlesViewModel(get()) }
}
