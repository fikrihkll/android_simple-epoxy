package com.teamdagger.epoxysimpleexample.entity

data class Task (
    val title: String,
    val description: String,
    val people: List<Person>
)