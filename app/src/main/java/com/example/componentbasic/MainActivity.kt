package com.example.componentbasic

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    var campoTexto: EditText? = null

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val miBotton:Button= findViewById(R.id.botonEnviar)
        miBotton.setOnClickListener{onClick()}

    }

    private fun onClick() {

        val campoTexto: EditText = findViewById(R.id.plain1)
        var nombre:String=campoTexto.text.toString()
        Toast.makeText(this, nombre, Toast.LENGTH_LONG).show()

        val radio1: RadioButton?
        val radio2: RadioButton?

        radio1 = findViewById(R.id.radioButton1)
        radio2 = findViewById(R.id.radioButton2)

        var cad = "Seleccionado: \n"

        if (radio1?.isChecked == true) {
            cad += "Opcion1\n"
        }
        if (radio2?.isChecked == true) {
            cad += "Opcion2\n"
        }
        Toast.makeText(this, cad, Toast.LENGTH_LONG).show()
    }

}