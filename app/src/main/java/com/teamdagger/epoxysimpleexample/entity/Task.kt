package com.teamdagger.epoxysimpleexample.entity

import androidx.annotation.ColorInt

data class Task (
    val title: String,
    val description: String,
    val people: List<Person>,
    @ColorInt val taskColor: Int
)