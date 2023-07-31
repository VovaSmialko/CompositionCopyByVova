package com.example.compositioncopy.domain.entity

data class GameSettings (
    val maxSumValue: Int,
    val minCountOfRightAnswers: Int,
    val minPercentOfRightQuestion: Int,
    val gameTimeInSeconds: Int
        )