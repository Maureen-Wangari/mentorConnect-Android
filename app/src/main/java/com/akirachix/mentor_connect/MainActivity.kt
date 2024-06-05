package com.akirachix.mentor_connect

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.textclassifier.TextLinks.TextLink
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Login=findViewById<TextView>(R.id.Login)
        Login.setOnClickListener {
            val intent = Intent( this,login_Page::class.java)
            startActivity(intent)
        }
}
    }