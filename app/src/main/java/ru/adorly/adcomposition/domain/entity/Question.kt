package ru.adorly.adcomposition.domain.entity

data class Question (
    val Summ: Int,
    val visibleNumber: Int,
    val options: List<Int>
        )