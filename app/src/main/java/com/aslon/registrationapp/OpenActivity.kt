package com.aslon.registrationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aslon.registrationapp.databinding.ActivityOpenBinding

class OpenActivity : AppCompatActivity() {

    lateinit var binding: ActivityOpenBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityOpenBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}