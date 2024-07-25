package ru.gb.android.homework3.presentation.promo.di

import ru.gb.android.homework3.domain.promo.ConsumePromosUseCase

interface PromoDependencies {
    fun getConsumePromosUseCase():ConsumePromosUseCase
}