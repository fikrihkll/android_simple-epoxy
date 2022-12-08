package com.teamdagger.epoxysimpleexample.util

import android.content.Context
import androidx.core.content.ContextCompat
import com.teamdagger.epoxysimpleexample.R
import com.teamdagger.epoxysimpleexample.entity.CarouselItem
import com.teamdagger.epoxysimpleexample.entity.Person
import com.teamdagger.epoxysimpleexample.entity.Task

object DummyData {

    val carouselItems = listOf(
        CarouselItem(
            title = "Playing Mini Soccer with Tubagus Hendra Toraja Coloro",
            description = "Tubagus Hendra Toraja Coloro hopes you could score a goal to your own side",
            type = "Sports"
        ),
        CarouselItem(
            title = "Playing Mini Soccer with Tubagus Hendra Toraja Coloro",
            description = "Tubagus Hendra Toraja Coloro hopes you could score a goal to your own side",
            type = "Sports"
        ),
        CarouselItem(
            title = "Playing Mini Soccer with Tubagus Hendra Toraja Coloro",
            description = "Tubagus Hendra Toraja Coloro hopes you could score a goal to your own side",
            type = "Sports"
        ),
        CarouselItem(
            title = "Playing Mini Soccer with Tubagus Hendra Toraja Coloro",
            description = "Tubagus Hendra Toraja Coloro hopes you could score a goal to your own side",
            type = "Sports"
        ),
    )

    fun provideTaskItems(context: Context): List<Task> {
        return listOf(
            Task(
                title = "Playing Mini Soccer with Tubagus Hendra Toraja Coloro",
                description = "Tubagus Hendra Toraja Coloro hopes you could score a goal to your own side",
                taskColor = R.color.teal_200,
                people = listOf(
                    Person(
                        id = "123",
                        name ="Coloro Jayoma",
                        imageUrl = "www.xxx.com"
                    ),
                    Person(
                        id = "122",
                        name ="Dans Coloro",
                        imageUrl = "www.com.xxx"
                    ),
                    Person(
                        id = "222",
                        name ="Coloro Ying",
                        imageUrl = "www.com.xxx"
                    )
                )
            ),
            Task(
                title = "Playing Mini Soccer with Tubagus Hendra Toraja Coloro",
                description = "Tubagus Hendra Toraja Coloro hopes you could score a goal to your own side",
                taskColor = R.color.teal_700,
                people = listOf(
                    Person(
                        id = "123",
                        name ="Coloro Jayoma",
                        imageUrl = "www.xxx.com"
                    ),
                    Person(
                        id = "122",
                        name ="Dans Coloro",
                        imageUrl = "www.com.xxx"
                    ),
                    Person(
                        id = "222",
                        name ="Coloro Ying",
                        imageUrl = "www.com.xxx"
                    )
                )
            ),
            Task(
                title = "Playing Mini Soccer with Tubagus Hendra Toraja Coloro",
                description = "Tubagus Hendra Toraja Coloro hopes you could score a goal to your own side",
                taskColor = R.color.purple_200,
                people = listOf(
                    Person(
                        id = "123",
                        name ="Coloro Jayoma",
                        imageUrl = "www.xxx.com"
                    ),
                    Person(
                        id = "122",
                        name ="Dans Coloro",
                        imageUrl = "www.com.xxx"
                    ),
                    Person(
                        id = "222",
                        name ="Coloro Ying",
                        imageUrl = "www.com.xxx"
                    )
                )
            ),
            Task(
                title = "Playing Mini Soccer with Tubagus Hendra Toraja Coloro",
                description = "Tubagus Hendra Toraja Coloro hopes you could score a goal to your own side",
                taskColor = R.color.purple_500,
                people = listOf(
                    Person(
                        id = "123",
                        name ="Coloro Jayoma",
                        imageUrl = "www.xxx.com"
                    ),
                    Person(
                        id = "122",
                        name ="Dans Coloro",
                        imageUrl = "www.com.xxx"
                    ),
                    Person(
                        id = "222",
                        name ="Coloro Ying",
                        imageUrl = "www.com.xxx"
                    )
                )
            ),
        )
    }

}