package com.example.componentbasic

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    var check1:CheckBox?=null
    var check2:CheckBox?=null

    var radio1:RadioButton?=null
    var radio2:RadioButton?=null

   var campoNombre:EditText?=null

    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        check1=findViewById(R.id.checkbox1)
        check2=findViewById(R.id.checkbox2)

        radio1=findViewById(R.id.radioButton1)
        radio2=findViewById(R.id.radioButton2)

        campoNombre=findViewById(R.id.txtNombre)

        val miBotton:Button= findViewById(R.id.botonEnviar)
        miBotton.setOnClickListener{onClick()}

    }

    private fun onClick() {

        var nombre:String=campoNombre?.text.toString()

        Toast.makeText(this, "$nombre", Toast.LENGTH_LONG).show()

        var cad: String = "Seleccionado: \n"

        if (check1?.isChecked == true) {
            cad += "Opcion1 C\n"
        }
        if (check2?.isChecked == true){
            cad += "Opcion2 C\n"
    }
        if (radio1?.isChecked == true) {
            cad += "Opcion 1\n"
        }
        if (radio2?.isChecked == true) {
            cad += "Opcion 2\n"
        }
        Toast.makeText(this, "$cad", Toast.LENGTH_LONG).show()
    }

}