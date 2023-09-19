package com.example.dma

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val iMainAct_lab1 = Intent(this, MainActivity_Lab1::class.java)
        val button_nextAct_lab1: Button = findViewById(R.id.button)
        button_nextAct_lab1.setOnClickListener{
            startActivity(iMainAct_lab1)
        }

        val iMainAct_lab2 = Intent(this, MainActivity_Lab2::class.java)
        val button_nextAct_lab2: Button = findViewById(R.id.button4)
        button_nextAct_lab2.setOnClickListener{
            startActivity(iMainAct_lab2)
        }

        val iMainAct_lab3 = Intent(this, MainActivity_Lab3::class.java)
        val button_nextAct_lab3: Button = findViewById(R.id.button7)
        button_nextAct_lab3.setOnClickListener{
            startActivity(iMainAct_lab3)
        }

    }
}