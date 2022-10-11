package com.example.simplecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.text.DecimalFormat


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        init()
    }


    private fun init() {

        val intent = Intent(this, ResultActivity2::class.java)

        val btnAdd: Button = findViewById(R.id.btnAddition)
        val btnSbt: Button = findViewById(R.id.btnSubtraction)
        val btnMul: Button = findViewById(R.id.btnMultiply)
        val btnDiv: Button = findViewById(R.id.btnDivision)


        btnAdd.setOnClickListener {
            val firstNumber: Double =
                findViewById<EditText>(R.id.number1EditTxt).text.toString().toDouble()
            val secondNumber: Double =
                findViewById<EditText>(R.id.number2EditTxt).text.toString().toDouble()
            val res: Double = firstNumber + secondNumber
            val dec = DecimalFormat("#.00")
            val formatted = dec.format(res).toDouble()
            intent.putExtra("res", formatted)
            startActivity(intent)
        }
        btnSbt.setOnClickListener {
            val firstNumber: Double =
                findViewById<EditText>(R.id.number1EditTxt).text.toString().toDouble()
            val secondNumber: Double =
                findViewById<EditText>(R.id.number2EditTxt).text.toString().toDouble()
            val res: Double = firstNumber - secondNumber
            val dec = DecimalFormat("#.00")
            val formatted = dec.format(res).toDouble()
            intent.putExtra("res", formatted)
            startActivity(intent)
        }
        btnMul.setOnClickListener {
            val firstNumber: Double =
                findViewById<EditText>(R.id.number1EditTxt).text.toString().toDouble()
            val secondNumber: Double =
                findViewById<EditText>(R.id.number2EditTxt).text.toString().toDouble()
            val res: Double = firstNumber * secondNumber
            val dec = DecimalFormat("#.00")
            val formatted = dec.format(res).toDouble()
            intent.putExtra("res", formatted)
            startActivity(intent)
        }
        btnDiv.setOnClickListener {
            val firstNumber: Double =
                findViewById<EditText>(R.id.number1EditTxt).text.toString().toDouble()
            val secondNumber: Double =
                findViewById<EditText>(R.id.number2EditTxt).text.toString().toDouble()
            if (secondNumber == 0.0) {
                Toast.makeText(this, "Can not divide by 0", Toast.LENGTH_SHORT).show()
            } else {
                val res: Double = firstNumber / secondNumber
                val dec = DecimalFormat("#.00")
                val formatted = dec.format(res).toDouble()
                intent.putExtra("res", formatted)
                startActivity(intent)
            }

        }
    }
}