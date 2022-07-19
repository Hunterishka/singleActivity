package com.example.singleactivity

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.singleactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)





        binding.btnSignIn.setOnClickListener {
            val edLogin1=binding.edLogin.text.toString()
            val txtLogin = intent.extras?.getString("txtLogin").toString()
            val txtPassword = intent.extras?.getString("data3").toString()
            if (edLogin1==txtLogin) {
            binding.txtPP.text=txtLogin.toString()
                intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
            else {

            }
        }


        binding.btnSignUp.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }


    }
}