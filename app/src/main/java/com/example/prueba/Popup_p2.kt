package com.example.prueba

import android.os.Bundle
import android.util.DisplayMetrics
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_popup_p2.*

class Popup_p2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_popup_p2)
        
        val mventana = DisplayMetrics()
        windowManager.defaultDisplay.getMetrics(mventana)
        val ancho = mventana.widthPixels
        val alto = mventana.heightPixels
        window.setLayout((ancho * 0.85).toInt(), (alto * 0.7).toInt())
        // Respuesta 1
        val r1= findViewById<Button>(R.id.rs)
        r1.setOnClickListener {
            respuesta()
            onBackPressed()
        }
        // Respuesta 2
        val r2= findViewById<Button>(R.id.rs1)
        r2.setOnClickListener {
            respuesta()
            onBackPressed()
        }
        // Respuesta 3
        val r3= findViewById<Button>(R.id.rs2)
        r3.setOnClickListener {
            respuesta()
            onBackPressed()
        }
    }

    private fun respuesta() {
        val resp: ImageView = findViewById(R.id.icon_res)
        if (rs.isPressed){
            resp.setImageResource(R.drawable.icon_correcto)
            Toast.makeText(this, "¡Es correcto!", Toast.LENGTH_SHORT).show()
            rs1.isEnabled=false
            rs2.isEnabled=false
        }else if (rs1.isPressed){
            resp.setImageResource(R.drawable.icon_error)
            Toast.makeText(this, "Respuesta erronea", Toast.LENGTH_SHORT).show()
            rs.isEnabled=false
            rs2.isEnabled=false
        }else if (rs2.isPressed){
            resp.setImageResource(R.drawable.icon_error)
            Toast.makeText(this, "Respuesta erronea", Toast.LENGTH_SHORT).show()
            rs.isEnabled=false
            rs1.isEnabled=false
        }
    }

}

