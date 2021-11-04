package ru.adorly.adcomposition.domain.repository

import ru.adorly.adcomposition.domain.entity.GameSettings
import ru.adorly.adcomposition.domain.entity.Level
import ru.adorly.adcomposition.domain.entity.Question

interface GameRepository {
    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}