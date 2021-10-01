package com.example.exercice3

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

    fun ChoisirNombre(view: View) {
        var linResult:LinearLayout = findViewById<LinearLayout>(R.id.linResult)
        var edtReal:EditText = findViewById<EditText>(R.id.edtReal)
        var edtImag:EditText = findViewById<EditText>(R.id.edtImag)
        var txtNombre:TextView = findViewById<TextView>(R.id.txtNombre)

        linResult.visibility = View.VISIBLE

        var myNumber:MyComplex = MyComplex(edtReal.text.toString().toDouble(),edtReal.text.toString().toDouble())

        txtNombre.text = "Mon nombre est:  " + myNumber.toString()
    }
}