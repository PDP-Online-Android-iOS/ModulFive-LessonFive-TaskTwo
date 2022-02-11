package dev.ogabek.kotlin.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import dev.ogabek.kotlin.R
import dev.ogabek.kotlin.adapter.CategoryAdapter
import dev.ogabek.kotlin.adapter.MainAdapter
import dev.ogabek.kotlin.adapter.TodaysDealsAdapter
import dev.ogabek.kotlin.model.Category
import dev.ogabek.kotlin.model.Favorite
import dev.ogabek.kotlin.model.TodaysDeals

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {
        val rvMain = findViewById<RecyclerView>(R.id.rv_main)
        val todaysDeals = findViewById<RecyclerView>(R.id.rv_today_s_deal)
        val category = findViewById<RecyclerView>(R.id.rv_category)
        rvMain.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvMain.adapter = MainAdapter(this, prepareFavoriteList())
        todaysDeals.layoutManager = GridLayoutManager(this, 1, GridLayoutManager.HORIZONTAL, false)
        todaysDeals.adapter = TodaysDealsAdapter(this, prepareTodaysList())
        category.layoutManager = GridLayoutManager(this, 3, GridLayoutManager.VERTICAL, false)
        category.adapter = CategoryAdapter(this, prepareCategories())
    }

    private fun prepareTodaysList(): List<TodaysDeals> {
        val list: MutableList<TodaysDeals> = ArrayList<TodaysDeals>()
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        list.add(TodaysDeals(R.drawable.i_phone, "iPhone 13 Pro Max", 1099.99, 1199.99, 8.4))
        return list
    }

    private fun prepareFavoriteList(): ArrayList<Favorite> {
        val list: ArrayList<Favorite> = ArrayList<Favorite>()
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        list.add(Favorite("iWatch", R.drawable.i_watch))
        list.add(Favorite("iPhone", R.drawable.i_phone))
        return list
    }

    private fun prepareCategories(): java.util.ArrayList<Category> {
        val list: ArrayList<Category> = java.util.ArrayList<Category>()
        list.add(Category("Boats", R.drawable.boat))
        list.add(Category("Cars", R.drawable.car))
        list.add(Category("Drones", R.drawable.drone))
        list.add(Category("Motorcycles", R.drawable.motorcycle))
        list.add(Category("Planes", R.drawable.plane))
        list.add(Category("Robots", R.drawable.robats))
        return list
    }

}