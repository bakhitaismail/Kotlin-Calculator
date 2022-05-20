package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etNumerator: EditText
    lateinit var etDenomenator: EditText
    lateinit var btnAdd: Button
    lateinit var btnSubtract: Button
    lateinit var btnMultiply:Button
    lateinit var btnModulus: Button
    lateinit var tvResult: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etNumerator  = findViewById(R.id.etNumerator)
        etDenomenator = findViewById(R.id.etDenomenator)
        btnAdd  = findViewById(R.id.btnAdd)
        btnSubtract = findViewById(R.id.btnSubtract)
        btnMultiply = findViewById(R.id.btnMultiply)
        btnModulus = findViewById(R.id.btnModulus)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            var numerator = etNumerator.text.toString().toInt()
            var denomenator = etDenomenator.text.toString().toInt()
            add(numerator, denomenator)

        }
        btnSubtract.setOnClickListener {
            var numerator = etNumerator.text.toString().toInt()
            var denomenator = etDenomenator.text.toString().toInt()
            subtract(numerator, denomenator)

        }
        btnMultiply.setOnClickListener {
            var numerator = etNumerator.text.toString().toInt()
            var denomenator = etDenomenator.text.toString().toInt()
            multiply(numerator, denomenator)
        }
        btnModulus.setOnClickListener {
            var numerator = etNumerator.text.toString().toInt()
            var denomenator = etDenomenator.text.toString().toInt()
            modulus(numerator, denomenator)
        }
    }

    fun add(numerator: Int, denomenator: Int){
        var result = numerator + denomenator
        tvResult.text = result.toString()
    }
    fun subtract(numerator: Int, denomenator: Int){
        var result = numerator - denomenator
        tvResult.text = result.toString()
    }
    fun multiply(numerator: Int, denomenator: Int){
        var result = numerator * denomenator
        tvResult.text = result.toString()
    }
    fun modulus(numerator: Int, denomenator: Int){
        var result = numerator % denomenator
        tvResult.text = result.toString()
    }
}