package com.example.madlabexam2

import FoodAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper


class Activity_main : AppCompatActivity(),FoodAdapter.myclicklistner {

    private lateinit var recyclerView: RecyclerView
    private lateinit var foodList :ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter
    private lateinit var foodList2 :ArrayList<Popular>
    private lateinit var popularAdapter: PopularAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)



        init()
        init2()






    }
    private fun init(){
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        val snapHelper:SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        foodList = ArrayList()
        adddatatolist()
        foodAdapter = FoodAdapter(foodList,this@Activity_main)
        recyclerView.adapter = foodAdapter


    }
    private fun init2(){
        recyclerView = findViewById(R.id.rw2)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager= LinearLayoutManager(this,RecyclerView.HORIZONTAL,false)
        val snapHelper:SnapHelper = LinearSnapHelper()
        snapHelper.attachToRecyclerView(recyclerView)
        foodList2 = ArrayList()
        adddatatolist2()
        popularAdapter = PopularAdapter(foodList2,this@Activity_main)
        recyclerView.adapter = popularAdapter


    }

    private fun adddatatolist(){
        foodList.add(Food(R.drawable.pizza,"Pizza"))
        foodList.add(Food(R.drawable.hotdog,"Hot Dog"))
        foodList.add(Food(R.drawable.coffe,"Drink"))
        foodList.add(Food(R.drawable.pasta,"Pasta"))

    }
    private fun adddatatolist2(){
        foodList2.add(Popular(R.drawable.untitled_design__3_,"Pizza"))
        foodList2.add(Popular(R.drawable.crolls__1_,"Hot Dog"))
        foodList2.add(Popular(R.drawable.crolls__2_,"Drink"))
        foodList2.add(Popular(R.drawable.iclair,"Pasta"))

    }

    override fun onClick(position: Int) {
        when(position){
            0 -> startActivity(Intent(this,Piizza_page::class.java))
        }
    }



}