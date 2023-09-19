package com.example.dma

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity_Lab3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_lab3)
        val button_back: Button = findViewById(R.id.button8)
        button_back.setOnClickListener{
            finish()
        }
        val button_calc: Button = findViewById(R.id.button12)
        button_calc.setOnClickListener{
            stringAddition()
        }
    }


    fun stringAddition(): Unit {
        val s1Edit: EditText = findViewById(R.id.editTextText13)
        val s2Edit: EditText = findViewById(R.id.editTextText14)
        var result: String = s1Edit.text.toString() + s2Edit.text.toString()
        val resultText = findViewById<TextView>(R.id.textView15)
        resultText.text = result
    }
}