package com.example.dma

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.pow

class MainActivity_Lab2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lab2)


        val button_back: Button = findViewById(R.id.button5)
        button_back.setOnClickListener{
            finish()
        }
        val button_calc: Button = findViewById(R.id.button6)
        button_calc.setOnClickListener{
            fCalc()
        }

    }

    fun fCalc(): Unit {
        val nEdit: EditText = findViewById(R.id.editTextText6)
        val xEdit: EditText = findViewById(R.id.editTextText5)
        val n: Int = nEdit.text.toString().trim().toInt()
        val x: Double = xEdit.text.toString().trim().toDouble()
        val resultText = findViewById<TextView>(R.id.textView6)
        var result = 0.0
        var i = 1
        val z1 = 4.0
        val z2 = 5.0

        while (i < n+1) {
            result += x / (z1.pow(i) + z2.pow(i+2))
            i++
        }
        resultText.text = result.toString()
    }
}