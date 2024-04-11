package com.example.madlabexam2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.madlabexam2.databinding.ActivityMainBinding

class login_Activity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    lateinit var username : EditText
    lateinit var password: EditText
    lateinit var loginButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var loginb = findViewById<Button>(R.id.loginButton)




        var userName = findViewById<EditText>(R.id.username)
        var userpw = findViewById<EditText>(R.id.password)

        binding = ActivityMainBinding.inflate(layoutInflater)

        loginb.setOnClickListener {
            if (userName.text.toString() == "user" && userpw.text.toString() == "1234"){
                Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()
                loginb.setOnClickListener {


                    val intent1 = Intent(this,Activity_main :: class.java )
                    startActivity(intent1)
                }

            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}




