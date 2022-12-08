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

@EpoxyModelClass(layout = R.layout.item_title)
abstract class TitleView(
    private val context: Context
) : EpoxyModelWithHolder<TitleView.Holder>() {

    @EpoxyAttribute
    lateinit var title: String

    override fun bind(holder: Holder) {
        super.bind(holder)
        holder.title.text = title
    }

    class Holder : EpoxyHolder() {

        lateinit var title: MaterialTextView

        override fun bindView(itemView: View) {
            title = itemView.findViewById(R.id.titleHeaderTextView)
        }

    }

}