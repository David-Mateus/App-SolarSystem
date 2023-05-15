package com.example.solarsystem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Scientists : AppCompatActivity() {

    private val cientistImages = arrayOf(
        R.drawable.galileo,
        R.drawable.nikolauskopernikus,
        R.drawable.jkepler,
        R.drawable.isaacnewton,
        R.drawable.hubble,
        R.drawable.carlsagan,
        R.drawable.stephenhawking,
        R.drawable.neiltyson
    )
    private  val cientistName = arrayOf(
        "Galileu Galilei",
        "Nicolau Copérnico",
        "Johannes Kepler",
        "Isaac Newton",
        "Edwin Hubble",
        "Stephen Hawking",
        "Neil deGrasse Tyson"
    )
    private val cientistDescriptions = arrayOf(
        "Famoso por suas descobertas astronômicas, como a observação das fases de Vênus, as manchas solares e os satélites de Júpiter.",
        "Conhecido por desenvolver a teoria heliocêntrica, que sugere que os planetas giram em torno do Sol.",
        "Famoso por suas leis do movimento planetário, que ajudaram a explicar a órbita dos planetas em torno do Sol.",
        "Famoso por suas leis do movimento e da gravitação, que explicam o movimento dos planetas e outros objetos celestes.",
        "Contribuiu para a compreensão da expansão do universo e para a descoberta de galáxias além da Via Láctea.",
        "Famoso por sua contribuição para a popularização da ciência, incluindo a astronomia, através de seus livros e programas de TV.",
        "Conhecido por suas teorias sobre o universo, incluindo a teoria da relatividade e a teoria do big bang.",
        "Conhecido por sua contribuição para a divulgação científica, incluindo a astronomia, através de seus livros, palestras e programas de TV."

    )
    private var currentPlanetIndex = 0;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scientists)

        val btnNext : Button = findViewById(R.id.next_button)
        btnNext.setOnClickListener {
            showNextCientist()
        }
        val btnPrev : Button = findViewById(R.id.detail_button)
        btnPrev.setOnClickListener {
            showPrevCientist()
        }
        val backImage : ImageView = findViewById(R.id.imageBack_btn);
        backImage.setOnClickListener{
            finish()
        }
        showCurrentCientist()
    }

    private fun showCurrentCientist(){
        showCientist(currentPlanetIndex);
    }
    private  fun showNextCientist(){
        if(currentPlanetIndex < cientistImages.size - 1){
            currentPlanetIndex++
        }else{
            currentPlanetIndex = 0
        }
        showCurrentCientist()
    }
    private fun showPrevCientist(){
        if(currentPlanetIndex > 0){
            currentPlanetIndex--
        }else{
            currentPlanetIndex = cientistImages.size - 1
        }
        showCurrentCientist()
    }
    private fun showCientist(cientistIndex : Int){
        val imageCientista : ImageView = findViewById(R.id.cientista_next)
        val nameCientista : TextView = findViewById(R.id.text_label)
        val descCientista : TextView = findViewById(R.id.txt_descripton)

        imageCientista.setImageResource(cientistImages[cientistIndex]);
        nameCientista.text = cientistName[cientistIndex];
        descCientista.text = cientistDescriptions[cientistIndex];
    }

}