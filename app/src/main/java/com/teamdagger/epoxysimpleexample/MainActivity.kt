package com.teamdagger.epoxysimpleexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.teamdagger.epoxysimpleexample.databinding.ActivityMainBinding
import com.teamdagger.epoxysimpleexample.epoxy_controller.HomeController
import com.teamdagger.epoxysimpleexample.util.DummyData

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val controller = HomeController(this)
        binding.taskEpoxyRecyclerView.setController(controller)

        controller.carouselTaskData = DummyData.carouselItems.toMutableList()
        controller.taskData = DummyData.provideTaskItems(this).toMutableList()
    }


}