package com.aslon.registrationapp

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aslon.registrationapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.btnLogin.setOnClickListener(){

     /*       if(    ) {
                val intent = Intent(this, OpenActivity::class.java)
                startActivity(intent)
            }*/


        }
        binding.textCreate.setOnClickListener(){
            val intent = Intent(this, CreateActivity::class.java)
            startActivity(intent)
        }
    }
}

