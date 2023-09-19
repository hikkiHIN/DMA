package com.example.dma

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt

class MainActivity_Lab1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lab1)
        val button_back: Button = findViewById(R.id.button2)
        button_back.setOnClickListener{
            finish()
        }
        val button_calc: Button = findViewById(R.id.button3)
        button_calc.setOnClickListener{
            fCalc()
        }
    }

    fun fCalc(): Unit {
        val n1: EditText = findViewById(R.id.editTextText)
        val n2: EditText = findViewById(R.id.editTextText2)
        val n3: EditText = findViewById(R.id.editTextText3)
        val c1: EditText = findViewById(R.id.editTextText4)

        val resultText1 = findViewById<TextView>(R.id.textView4)
        val c1Char = c1.text.toString().trim()
        val n1N = n1.text.toString().trim().toFloat()
        val n2N = n2.text.toString().trim().toFloat()
        val n3N = n3.text.toString().trim().toFloat()
        if (c1Char == "A"){
            resultText1.text = ((n1N+n2N+n3N)/3).toString()
        }
        else if (c1Char == "G"){
            resultText1.text = sqrt(n1N*n2N*n3N).toString()
        }
        else{
            resultText1.text = "Ошибка. Введен неверный символ."
            Toast.makeText(this, "Введен неизвестный символ", Toast.LENGTH_SHORT).show()
        }
    }

}