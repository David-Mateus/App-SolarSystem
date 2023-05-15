package com.example.solarsystem


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val backBtn : Button = findViewById(R.id.back_button)
        backBtn.setOnClickListener {
            finish();
        }
    }
}