package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager

class MainActivity : AppCompatActivity() {

    private  lateinit var recyclerView: RecyclerView
    private lateinit var foodList:ArrayList<food>
    private lateinit var foodAdapter: FoodAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView=findViewById(R.id.MRecycle)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)

        foodList=ArrayList()
        foodList.add(food(R.drawable.pizza,"pizza33"))
        foodList.add(food(R.drawable.pizza,"pizza44"))
        foodList.add(food(R.drawable.pizza,"pizza55"))
        foodList.add(food(R.drawable.pizza,"pizza66"))
        foodList.add(food(R.drawable.pizza,"pizza66"))
        foodList.add(food(R.drawable.pizza,"pizza66"))
        foodList.add(food(R.drawable.pizza,"pizza66"))
    foodAdapter= FoodAdapter(foodList)
        recyclerView.adapter=foodAdapter

    }
}