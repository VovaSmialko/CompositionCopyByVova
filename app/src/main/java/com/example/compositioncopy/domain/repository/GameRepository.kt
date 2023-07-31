package com.example.compositioncopy.domain.repository

import com.example.compositioncopy.domain.entity.GameSettings
import com.example.compositioncopy.domain.entity.Level
import com.example.compositioncopy.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}