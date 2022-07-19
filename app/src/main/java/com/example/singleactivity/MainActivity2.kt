package com.example.singleactivity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.singleactivity.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnRegister.setOnClickListener {
            val intent = Intent(this, MainActivity3::class.java)
            val editIsm: String = binding.edIsm.text.toString()
            val editFamiliya: String = binding.edFamiliya.text.toString()
            val editLogin: String = binding.edLogin.text.toString()
            val editParol: String = binding.edParol.text.toString()
            intent.putExtra("edIsm", editIsm)
            intent.putExtra("edFamiliya", editFamiliya)
            intent.putExtra("edLogin", editLogin)
            intent.putExtra("edParol", editParol)


            startActivity(intent)
            this.finish()
        }


    }
}