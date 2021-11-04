package ru.adorly.adcomposition.domain.usecases

import ru.adorly.adcomposition.domain.entity.GameSettings
import ru.adorly.adcomposition.domain.entity.Level
import ru.adorly.adcomposition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {

    operator fun invoke(level: Level):GameSettings{
        return repository.getGameSettings(level)
    }
}