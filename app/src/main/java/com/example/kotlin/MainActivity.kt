package com.example.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        if(BuildConfig.FLAVOR == "nexus")
        {
            val intentnexus = Intent(this, nexus::class.java)
            startActivity(intentnexus)
            Toast.makeText(this, "WELCOME NEXUS", Toast.LENGTH_SHORT).show()
        }
        else if(BuildConfig.FLAVOR == "otherprofile")
        {
            val intentotherprofile = Intent(this, otherprofile::class.java)
            startActivity(intentotherprofile)
            Toast.makeText(this, "WELCOME OTHER PROFILE", Toast.LENGTH_SHORT).show()

        }
    }
}