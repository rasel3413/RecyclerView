package com.example.myapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(private val foodList:ArrayList<food>):RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

    class FoodViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val image:ImageView=itemView.findViewById(R.id.imageView)
        val textview:TextView=itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.each_item,parent,false)

   return  FoodViewHolder(view)

    }

    override fun getItemCount(): Int {
      return foodList.size
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
      val food =foodList[position]
        holder.image.setImageResource(food.image)
        holder.textview.text=food.name
    }
}