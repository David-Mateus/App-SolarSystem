package com.example.solarsystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val planetImages = arrayOf(
        R.drawable.sistema_solar,
        R.drawable.sun,
        R.drawable.mercury,
        R.drawable.venus,
        R.drawable.earth,
        R.drawable.mars,
        R.drawable.jupiter,
        R.drawable.saturn,
        R.drawable.uranus,
        R.drawable.neptune,
    )
    private val planetNames = arrayOf(
        "Sistema Solar",
        "Sol",
        "Mercúrio",
        "Vênus",
        "Terra",
        "Marte",
        "Júpiter",
        "Saturno",
        "Urano",
        "Netuno"
    )
    private  val planetDescriptions = arrayOf(
        "Bem vindo ao aplictivo que mostra todos os planetas do sistema solar",
        "É uma estrela anã amarela que os demais corpos celestes do Sistema Solar orbitam. Ele é formado por gases e não dispõe de nenhuma superfície sólida",
        "É o menor e mais interno planeta do Sistema Solar, orbitando o Sol a cada 87,969 dias terrestres",
        "É um dos quatro planetas terrestres do Sistema Solar, significando que, como a Terra, ele é um corpo rochoso.",
        "É um dos planetas que fazem parte do Sistema Solar e é o terceiro planeta mais próximo do Sol.",
        "é o quarto planeta a partir do Sol, o segundo menor do Sistema Solar.",
        "É o maior planeta do Sistema Solar, tanto em diâmetro quanto em massa, e é o quinto mais próximo do Sol.",
        "É o sexto planeta a partir do Sol e o segundo maior do Sistema Solar atrás de Júpiter.",
        "É o sétimo planeta a partir do Sol, o terceiro maior e o quarto mais massivo dos oito planetas do Sistema Solar.",
        "É o oitavo planeta a partir do Sol e é um gigante gasoso com um diâmetro quatro vezes maior que o da Terra."
    )
    private var currentPlanetIndex = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val nextBtn: Button = findViewById(R.id.next_button)
        nextBtn.setOnClickListener  {
            showNextPlanet()
        }
        val prevBtn: Button = findViewById(R.id.detail_button)
        prevBtn.setOnClickListener {
            showPreviousPlanet()
        }
        val clickImgView : ImageView = findViewById(R.id.planet_next);
        clickImgView.setOnClickListener {
            val intent = Intent(this, DetailActivity::class.java);
            startActivity(intent)
        }
        val backBtn : ImageView = findViewById(R.id.imageBack_btn);
        backBtn.setOnClickListener {
            finish()
        }
        showCurrentPlanet()
    }

    private fun showCurrentPlanet(){
        showPlanet(currentPlanetIndex)
    }
    private fun showNextPlanet(){
        if(currentPlanetIndex < planetImages.size - 1){
            currentPlanetIndex++
        }else{
            currentPlanetIndex = 0
        }
        showCurrentPlanet()
    }
    private fun showPreviousPlanet(){
        if(currentPlanetIndex > 0){
            currentPlanetIndex--
        }
        else{
            currentPlanetIndex = planetImages.size - 1
        }
        showCurrentPlanet()
    }
    private fun showPlanet(planetIndex:Int){
        val imagePlanet: ImageView = findViewById(R.id.planet_next);
        val textPlanet: TextView = findViewById(R.id.text_label);
        val desc: TextView = findViewById(R.id.txt_descripton);

        imagePlanet.setImageResource(planetImages[planetIndex])
        textPlanet.text = planetNames[planetIndex];
        desc.text = planetDescriptions[planetIndex]
    }


}


