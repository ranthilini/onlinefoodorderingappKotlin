package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class get_started : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getstarted)

        var button2 = findViewById<Button>(R.id.startedbtn)
        button2.setOnClickListener {


            val intent1 = Intent(this,login_Activity :: class.java )
            startActivity(intent1)
        }



    }
}