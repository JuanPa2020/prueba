package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.ImageView

class Ajustes : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ajustes)

        val mventana = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(mventana)
        val ancho = mventana.widthPixels
        val alto = mventana.heightPixels
        window.setLayout((ancho * 0.85).toInt(), (alto * 0.7).toInt())


        val ace= findViewById<ImageView>(R.id.acerca)
        ace.setOnClickListener {
            val acer = Intent(this, Acercade::class.java)
            startActivity(acer)
        }
    }
}