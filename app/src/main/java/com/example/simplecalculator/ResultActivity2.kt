package com.example.simplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity2 : AppCompatActivity() {

    

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result2)
        init()
    }

    private fun init(){
        val resTxtView: TextView = findViewById(R.id.resTextView)
        val passed: String = intent.getDoubleExtra("res", 0.0).toString()
        val text = "Answer is: $passed"
        resTxtView.text = text
    }
}