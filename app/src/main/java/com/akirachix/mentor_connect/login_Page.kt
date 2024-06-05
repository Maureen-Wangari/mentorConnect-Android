package com.akirachix.mentor_connect

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class login_Page : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login_page)
        val signUp=findViewById<TextView>(R.id.signUp)
        signUp.setOnClickListener {
            val intent = Intent( this,MainActivity::class.java)
            startActivity(intent)
        }
        }
    }
