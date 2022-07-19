package com.example.singleactivity

import android.content.SharedPreferences
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.singleactivity.databinding.ActivityMain3Binding

class MainActivity3 : AppCompatActivity() {
    lateinit var binding: ActivityMain3Binding
    lateinit var preference: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        preference = getSharedPreferences("baza", MODE_PRIVATE)
        readData()

        val txtLogin = binding.txtLogin.text.toString()
        intent.putExtra("txtLogin", txtLogin)
        val txtParol = binding.txtPassword.text.toString()
        intent.putExtra("txtParol", txtParol)

        val editIsm = intent.extras?.getString("edIsm")
//        binding.txtName.text = editIsm
        val editFamiliya = intent.extras?.getString("edFamiliya")
//        binding.txtSurname.text = editFamiliya
        val editLogin = intent.extras?.getString("edLogin")
//        binding.txtLogin.text = editLogin
        val editParol = intent.extras?.getString("edParol")
//        binding.txtPassword.text = editParol

        binding.btnLogOut.setOnClickListener {
            saveData(editIsm.toString())
            saveData(editFamiliya.toString())
            saveData(editLogin.toString())
            saveData(editParol.toString())
            this.finish()
        }
    }

    fun saveData(data: String) {
        val myEdit3: SharedPreferences.Editor = preference.edit()
        val myEdit2: SharedPreferences.Editor = preference.edit()
        val myEdit: SharedPreferences.Editor = preference.edit()
        val myEdit1: SharedPreferences.Editor = preference.edit()
        val editIsm = intent.extras?.getString("edIsm")
        binding.txtName.text = editIsm
        val editFamiliya = intent.extras?.getString("edFamiliya")
        binding.txtSurname.text = editFamiliya
        val editLogin = intent.extras?.getString("edLogin")
        binding.txtLogin.text = editLogin
        val editParol = intent.extras?.getString("edParol")
        binding.txtPassword.text = editParol
        myEdit3.putString("data3", editParol.toString())
        myEdit3.apply()
        myEdit2.putString("data2", editLogin.toString())
        myEdit2.apply()
        myEdit1.putString("data1", editFamiliya.toString())
        myEdit1.apply()
        myEdit.putString("data", editIsm.toString())
        myEdit.apply()
    }


    fun readData() {
        val editLogin = intent.extras?.getString("edLogin")
        binding.txtLogin.text = editLogin
        val savedText: String = preference.getString("data", "null").toString()
        binding.txtName.text = savedText
        val savedText1: String = preference.getString("data1", "null").toString()
        binding.txtSurname.text = savedText1
        val savedText2: String = preference.getString("data2", "null").toString()
        binding.txtLogin.text = savedText2
        val savedText3: String = preference.getString("data3", "null").toString()
        binding.txtPassword.text = savedText3
    }
}