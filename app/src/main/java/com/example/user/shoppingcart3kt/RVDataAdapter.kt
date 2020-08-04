package com.example.user.shoppingcart3kt

import android.support.design.widget.Snackbar
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by user on 21-Jul-20.
 */

class RVDataAdapter(private val cardItemList: List<RVItem>) : RecyclerView.Adapter<RVItemHolder>() {

            override fun getItemCount(): Int {
                var ret = 0
                if (cardItemList != null) {
                    ret = cardItemList.size
                }
                return ret
            }
            override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RVItemHolder {
                // Get LayoutInflater object.
                val layoutInflater = LayoutInflater.from(parent.context)
                // Inflate the RecyclerView item layout xml.
                val cardItemView = layoutInflater.inflate(R.layout.activity_rvitem, parent, false)

                // Get title text view object.
                val cartTitleView:TextView =cardItemView.findViewById(R.id.card_view_image_title)
                // Get image view object.
                val cartImageView:ImageView = cardItemView.findViewById(R.id.card_view_image)

                // When click the image.
                cartImageView.setOnClickListener {
                    // Get car title text.
                    val cartTitle = cartTitleView.text.toString()
                    // Create a snackbar and show it.
                    val snackbar = Snackbar.make(cartImageView, "You click $cartTitle image", Snackbar.LENGTH_LONG)
                    snackbar.show()
                }
                // Create and return our custom Car Recycler View Item Holder object.
                return RVItemHolder(cardItemView)
            }

           override fun onBindViewHolder(holder: RVItemHolder, position: Int) {
                if (cardItemList != null) {
                        // Get  item dto in list.
                        val carItem = cardItemList[position]
                        if (carItem != null) {
                            // Set item title.
                            holder.itemTitleText?.text = carItem.itemName
                            // Set image resource id.
                            holder.itemImageView?.setImageResource(carItem.itemImageId)
                        }
                }
            }
        }

