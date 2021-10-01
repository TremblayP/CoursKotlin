package com.example.exercice2

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

    fun afficheCercle(view: View) {
        var linCercle:LinearLayout = findViewById<LinearLayout>(R.id.linearCercle)
        var linRectangle:LinearLayout = findViewById<LinearLayout>(R.id.linearRectangle)

        linRectangle.visibility = View.GONE
        linCercle.visibility = View.VISIBLE
    }

    fun afficheRectangle(view: View) {
        var linCercle:LinearLayout = findViewById<LinearLayout>(R.id.linearCercle)
        var linRectangle:LinearLayout = findViewById<LinearLayout>(R.id.linearRectangle)

        linCercle.visibility = View.GONE
        linRectangle.visibility = View.VISIBLE
    }

    fun CreateCercle(view: View) {
        var edtRayon:EditText = findViewById<EditText>(R.id.edtRayon)
        var edtColor:EditText = findViewById<EditText>(R.id.edtColor)
        var txtResultCercle:TextView = findViewById<TextView>(R.id.txtResultCercle)

        var monCercle:Circle = Circle(edtRayon.text.toString().toDouble(),edtColor.text.toString(),false)
        txtResultCercle.text = monCercle.toString()
    }

    fun CreateRectangle(view: View) {
        var edtHauteur:EditText = findViewById<EditText>(R.id.edtHauteur)
        var edtLongueur:EditText = findViewById<EditText>(R.id.edtLongueur)
        var edtColor:EditText = findViewById<EditText>(R.id.edtColorRec)
        var txtResultRectangle:TextView = findViewById<TextView>(R.id.txtResultRectangle)

        if(edtHauteur.text.toString().toDouble() == edtLongueur.text.toString().toDouble()){
            var monSquare:Square = Square(edtHauteur.text.toString().toDouble(),edtColor.text.toString(),false)
            txtResultRectangle.text = monSquare.toString()
        }else{
            var monRectangle:Rectangle = Rectangle(edtLongueur.text.toString().toDouble(),edtHauteur.text.toString().toDouble(),edtColor.text.toString(),false)
            txtResultRectangle.text = monRectangle.toString()
        }


    }


}