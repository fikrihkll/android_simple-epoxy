package com.teamdagger.epoxysimpleexample.epoxy_model

import android.content.Context
import android.os.Build
import android.os.Message
import android.view.View
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.google.android.material.card.MaterialCardView
import com.google.android.material.textview.MaterialTextView
import com.teamdagger.epoxysimpleexample.R
import com.teamdagger.epoxysimpleexample.entity.Task
import java.util.UUID

@EpoxyModelClass(layout = R.layout.item_task)
abstract class TaskView(
    private val context: Context
): EpoxyModelWithHolder<TaskView.Holder>() {

    @EpoxyAttribute
    lateinit var item: Task

    @EpoxyAttribute
    var onCardClicked: ((Message: Task) -> Unit)? = null

    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.title.text = UUID.randomUUID().toString()
        holder.desc.text = item.title
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            holder.indicator.setBackgroundColor(context.getColor(item.taskColor))
        } else {
            holder.indicator.setBackgroundColor(context.resources.getColor(item.taskColor))
        }
        holder.peopleCount.text = "${item.people.size} People"
        holder.taskCardView.setOnClickListener {
            this@TaskView.
            onCardClicked?.invoke(item)
        }
    }

    inner class Holder : EpoxyHolder() {

        lateinit var title: MaterialTextView
        lateinit var desc: MaterialTextView
        lateinit var indicator: View
        lateinit var peopleCount: MaterialTextView
        lateinit var taskCardView: MaterialCardView

        override fun bindView(itemView: View) {
            title = itemView.findViewById(R.id.taskTitleTextView)
            desc = itemView.findViewById(R.id.taskDescriptionTextView)
            indicator = itemView.findViewById(R.id.taskColorIndicator)
            peopleCount = itemView.findViewById(R.id.taskPeopleCountTextView)
            taskCardView = itemView.findViewById(R.id.taskCardView)
        }

    }

}