package com.example.madlabexam2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class PopularAdapter(private val foodList2: List<Popular>, private val listener1: Activity_main) :
    RecyclerView.Adapter<PopularAdapter.FoodViewHolder>() {

        class FoodViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
            val foodImageView: ImageView = itemView.findViewById(R.id.imageView2)
            val foodNameTv: TextView = itemView.findViewById(R.id.textView2)

            fun bind(position: Int, listener: Activity_main) {
                itemView.setOnClickListener {
                    listener.onClick(position)
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.popularrow, parent, false)
        return FoodViewHolder(view)
    }


    override fun onBindViewHolder(holder: PopularAdapter.FoodViewHolder, position: Int) {

        val food = foodList2[position]
        holder.foodImageView.setImageResource(food.foodiamge)
        holder.foodNameTv.text = food.foodname

        holder.bind(position, listener1)

    }

    override fun getItemCount(): Int {
            return foodList2.size
        }



        interface FoodAdapterClickListener {
            fun onClick(position: Int)
        }
        interface myclicklistner{
            fun onClick(position: Int){

            }
        }
    }




