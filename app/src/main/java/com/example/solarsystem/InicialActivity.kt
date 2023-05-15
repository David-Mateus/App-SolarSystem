package com.example.solarsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InicialActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicial)

        val btnSystemSolar : Button = findViewById(R.id.btn_system);
        btnSystemSolar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val btnCientista : Button = findViewById(R.id.btn_cientista)
        btnCientista.setOnClickListener {
            val intent = Intent(this, Scientists::class.java)
            startActivity(intent)
        }
    }
}