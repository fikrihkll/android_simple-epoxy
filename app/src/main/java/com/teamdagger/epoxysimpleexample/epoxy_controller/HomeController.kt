package com.teamdagger.epoxysimpleexample.epoxy_controller

import android.content.Context
import android.widget.Toast
import com.airbnb.epoxy.AsyncEpoxyController
import com.airbnb.epoxy.carousel
import com.teamdagger.epoxysimpleexample.entity.CarouselItem
import com.teamdagger.epoxysimpleexample.entity.Task
import com.teamdagger.epoxysimpleexample.epoxy_model.CarouselView_
import com.teamdagger.epoxysimpleexample.epoxy_model.taskView
import com.teamdagger.epoxysimpleexample.epoxy_model.titleView
import java.util.UUID

class HomeController(private val context: Context) : AsyncEpoxyController() {

    var carouselTaskData = mutableListOf<CarouselItem>()
        set(value) {
            field.clear()
            field.addAll(value)
            requestModelBuild()
        }

    var taskData = mutableListOf<Task>()
        set(value) {
            field.clear()
            field.addAll(value)
            requestModelBuild()
        }

    override fun buildModels() {
        titleView(context) {
            this.id(UUID.randomUUID().toString())
            this.title("Carousel Task List")
        }
        val models = this@HomeController.carouselTaskData.map {
            CarouselView_(context)
                .id(UUID.randomUUID().toString())
                .item(it)
        }
        carousel {
            this.id(UUID.randomUUID().toString())
            this.models(models)
        }
        titleView(context) {
            this.id(UUID.randomUUID().toString())
            this.title("Task List")
        }
        this@HomeController.taskData.forEach {
            taskView(context) {
                this.id(UUID.randomUUID().toString())
                this.item(it)
                this.onCardClicked {
                    this@HomeController.taskData[1] = this@HomeController.taskData[1].copy(title = UUID.randomUUID().toString())
                    this@HomeController.notifyModelChanged(3)
                    Toast.makeText(
                        this@HomeController.context,
                        "${it.title} clicked",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
        }

    }
}