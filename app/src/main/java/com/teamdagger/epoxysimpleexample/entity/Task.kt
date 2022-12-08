package com.teamdagger.epoxysimpleexample.entity

import androidx.annotation.ColorRes

data class Task (
    val title: String,
    val description: String,
    val people: List<Person>,
    @ColorRes val taskColor: Int
)