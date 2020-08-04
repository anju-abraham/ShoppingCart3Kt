package com.example.user.shoppingcart3kt

import android.app.Activity
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.RecyclerView

import java.util.ArrayList

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        title = "Shop"

        /* Initialise cart items in list. */

        val cartItemList = ArrayList<RVItem>()
        cartItemList.add(RVItem("Grocery Items ", R.drawable.grocery))
        cartItemList.add(RVItem("Vegetables ", R.drawable.veg))
        cartItemList.add(RVItem("Fruits ", R.drawable.fruit))
        cartItemList.add(RVItem("Rice ", R.drawable.rice))
        cartItemList.add(RVItem("Farm Produce or Diary ", R.drawable.dairy))
        cartItemList.add(RVItem("Household Items ", R.drawable.detergent))
        cartItemList.add(RVItem("Items in Freezer ", R.drawable.freezer))
        cartItemList.add(RVItem("Items in Chiller ", R.drawable.ic_launcher_foreground))
        cartItemList.add(RVItem("Meat ", R.drawable.meat))
        cartItemList.add(RVItem("Fish ", R.drawable.fish))


        // Create the recyclerview.
        val cartRecyclerView: RecyclerView = findViewById(R.id.card_view_recycler_list)

        // Create the grid layout manager with 2 columns.
        val gridLayoutManager = GridLayoutManager(this, 2)
        // Set layout manager.
        cartRecyclerView.setLayoutManager(gridLayoutManager)

        // Create car recycler view data adapter with car item list.
        val cartDataAdapter = RVDataAdapter(cartItemList)
        // Set data adapter.
        cartRecyclerView.setAdapter(cartDataAdapter)
    }
}
