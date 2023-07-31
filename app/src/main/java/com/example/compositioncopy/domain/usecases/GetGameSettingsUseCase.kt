package com.example.compositioncopy.domain.usecases

import com.example.compositioncopy.domain.entity.GameSettings
import com.example.compositioncopy.domain.entity.Level
import com.example.compositioncopy.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)

    }
}