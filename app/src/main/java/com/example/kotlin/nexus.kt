package com.example.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class nexus : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nexus)

        var et_user_name = findViewById(R.id.txt_idnexus) as EditText
        var et_password = findViewById(R.id.txt_passwordnexus) as EditText
        var btn_acceso = findViewById(R.id.btn_signup) as Button
    btn_acceso.setOnClickListener {
        if (et_user_name.text.isNullOrBlank() && et_password.text.isNullOrBlank())
        {
            Toast.makeText(this, "nullo", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(this, "aacceso", Toast.LENGTH_SHORT).show()

        }
    }
    }

}