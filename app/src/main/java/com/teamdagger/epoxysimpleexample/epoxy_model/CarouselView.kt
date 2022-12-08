package com.teamdagger.epoxysimpleexample.epoxy_model

import android.content.Context
import android.view.View
import android.widget.ImageView
import androidx.appcompat.content.res.AppCompatResources
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyHolder
import com.airbnb.epoxy.EpoxyModelClass
import com.airbnb.epoxy.EpoxyModelWithHolder
import com.google.android.material.textview.MaterialTextView
import com.teamdagger.epoxysimpleexample.R
import com.teamdagger.epoxysimpleexample.entity.CarouselItem
import java.util.UUID

@EpoxyModelClass(layout = R.layout.item_carousel)
abstract class CarouselView(
    private val context: Context
) : EpoxyModelWithHolder<CarouselView.Holder>() {

    @EpoxyAttribute
    lateinit var item: CarouselItem

    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.title.text = UUID.randomUUID().toString()
        holder.description.text = item.description
        holder.imageView.setImageDrawable(AppCompatResources.getDrawable(context, R.drawable.bg_circle_gray))
    }

    class Holder : EpoxyHolder() {

        lateinit var title: MaterialTextView
        lateinit var description: MaterialTextView
        lateinit var imageView: ImageView

        override fun bindView(itemView: View) {
            title = itemView.findViewById(R.id.taskTitleCarouselTextView)
            description = itemView.findViewById(R.id.taskDescCarouselTextView)
            imageView = itemView.findViewById(R.id.taskIndicatorImageView)
        }

    }

}