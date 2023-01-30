package com.aslon.registrationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.aslon.registrationapp.databinding.ActivityCreateBinding

class CreateActivity : AppCompatActivity() {

    lateinit var binding: ActivityCreateBinding
    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        binding = ActivityCreateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val sharedPreferences = getSharedPreferences("myPref", MODE_PRIVATE)
        val editor = sharedPreferences.edit()

        binding.apply {
            btnCreateAccount.setOnClickListener{

                val userName = textUserNameCreate.text.toString()
                val age = textAge.text.toString()
                val gender = textGender.text.toString()
                val password = createPassword.text.toString()
                val editPassWord = editPassword.text.toString()
                if(password ==editPassWord) {
                    editor.apply {
                        putString("user_name", userName)
                        putString("user_age", age)
                        putString("gender", gender)
                        putString("password", password)
                        putString("editPassword", editPassWord)
                    }
                }
            }
        }


        binding.exitImg.setOnClickListener(){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    /*fun addAccount(person: Person) = binding.apply{
        person.userName = textUserNameCreate.toString()
        person.age = textAge.toString().toInt()
        person.gender = textGender.toString()
        person.password = createPassword.toString()
        person.repeatPassword = editPassword.toString()

    }*/

}