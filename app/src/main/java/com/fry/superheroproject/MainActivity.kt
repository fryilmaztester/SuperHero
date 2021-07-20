package com.fry.superheroproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun superKahramanYap(view:View){

        
        val name = nameText.text.toString()
        val age =  yasText.text.toString().toIntOrNull()
        val job = meslekText.text.toString()


        if (age == null){

            resultText.text = "Doğru Yaşı Giriniz!!"

        }else{

            var superKahraman = SuperKahraman(name,age,job)

            resultText.text = "Name: ${superKahraman.name} Age: ${superKahraman.age} Job: ${superKahraman.job}"
        }

    }
}