package com.example.exercice1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }


    fun CreateCircle(view: View) {
        var edtRayon:EditText = findViewById<EditText>(R.id.EdtRayon)
        var edtCouleur:EditText = findViewById<EditText>(R.id.EdtCouleur)
        //var edtHeight:EditText = findViewById<EditText>(R.id.EdtHeight)

        var monCercle:TextView = findViewById<TextView>(R.id.txtMonCercle)
        val text:String = edtCouleur.text.toString()
        val rayonTxt = edtRayon.text.toString()
        //val hauteurTxt = edtHeight.text.toString()
        val rayon:Double = rayonTxt.toDouble()
        //val hauteur:Double = hauteurTxt.toDouble()
        var myCircle:Circle = Circle(text,rayon)
        monCercle.text = myCircle.toString()


    }

    fun CreateCylindre(view: View) {
        var edtRayon:EditText = findViewById<EditText>(R.id.EdtRayon2)
        var edtCouleur:EditText = findViewById<EditText>(R.id.EdtCouleur2)
        var edtHeight:EditText = findViewById<EditText>(R.id.EdtHeight)

        var monCylindre:TextView = findViewById<TextView>(R.id.txtMonCylindre)
        val text:String = edtCouleur.text.toString()
        val rayonTxt = edtRayon.text.toString()
        val hauteurTxt = edtHeight.text.toString()
        val rayon:Double = rayonTxt.toDouble()
        val hauteur:Double = hauteurTxt.toDouble()
        var myCylinder:Cylinder = Cylinder(text,rayon,hauteur)
        monCylindre.text = myCylinder.toString()
    }


}