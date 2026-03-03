package com.example.practica1_videojuegos_activities

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GeneracionesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_generaciones)
        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Botón "Consolas" (ID: button4) -> abre ConsolasActivity (que contiene el Fragmento)
        val btnConsolas = findViewById<Button>(R.id.button4)
        btnConsolas.setOnClickListener {
            val intent = Intent(this, ConsolasActivity::class.java)
            startActivity(intent)
        }

        // Botón "Juegos Top" (ID: button) -> abre JuegosActivity
        val btnJuegosTop = findViewById<Button>(R.id.button)
        btnJuegosTop.setOnClickListener {
            val intent = Intent(this, JuegosActivity::class.java)
            startActivity(intent)
        }
    }
}