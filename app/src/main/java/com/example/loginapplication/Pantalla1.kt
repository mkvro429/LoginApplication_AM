package com.example.loginapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Pantalla1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pantalla1)
        val logoutButton = findViewById<Button>(R.id.logout_button)
        logoutButton.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Logout successful", Toast.LENGTH_SHORT).show()
            finish()
        }
        val pantalla2 = findViewById<Button>(R.id.pantalla2_button)
        pantalla2.setOnClickListener {
            val intent = Intent(this, Pantalla2::class.java)
            startActivity(intent)
            finish()
        }
        val pantalla3 = findViewById<Button>(R.id.pantalla3_button)
        pantalla3.setOnClickListener {
            val intent = Intent(this, Pantalla3::class.java)
            startActivity(intent)
            finish()
        }
        val pantalla4 = findViewById<Button>(R.id.pantalla4_button)
        pantalla4.setOnClickListener {
            val intent = Intent(this, Pantalla4::class.java)
            startActivity(intent)
            finish()
        }
    }
}