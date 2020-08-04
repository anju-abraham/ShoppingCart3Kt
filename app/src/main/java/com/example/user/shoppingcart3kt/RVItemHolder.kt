package com.example.user.shoppingcart3kt

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView

    class RVItemHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var itemTitleText: TextView? = null
        var itemImageView: ImageView? = null

        init {
         // if (itemView != null) {
                itemTitleText = itemView.findViewById(R.id.card_view_image_title)
                itemImageView = itemView.findViewById(R.id.card_view_image)
            // }
        }
}
