package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class Settings_Activity : AppCompatActivity() {


    private lateinit var bottomNavigationView : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

       bottomNavigationView = findViewById(R.id.bottomNavigationView)
        bottomNavigationView.setOnItemSelectedListener { menuItem ->
            when(menuItem.itemId){
                R.id.miHome -> {
                    navigateToActivity(Activity_main::class.java)
                    true

                }
                R.id.miProfile -> {
                    navigateToActivity(Profile_Activity::class.java)

                    true
                }
                R.id.miCart ->{
                    navigateToActivity(Cart_Activity::class.java)

                    true
                }
                R.id.miSettings ->{
                    navigateToActivity(Settings_Activity::class.java)

                    true
                }
                else -> false

            }

        }


    }
    private fun navigateToActivity(activityClass: Class<*>) {
        val intent3 = Intent(this, activityClass)
        startActivity(intent3)
    }

}


