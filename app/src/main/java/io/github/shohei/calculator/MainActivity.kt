package io.github.shohei.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Find the buttons and text view by their IDs

        val etNumber1 = findViewById<EditText>(R.id.etNumber1)
        val etNumber2 = findViewById<EditText>(R.id.etNumber2)
        val btnAddition = findViewById<Button>(R.id.btnAddition)
        val btnSubtraction = findViewById<Button>(R.id.btnSubtraction)
        val btnMultiplication = findViewById<Button>(R.id.btnMultiplication)
        val btnDivision = findViewById<Button>(R.id.btnDivision)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btnClear = findViewById<Button>(R.id.btnClear)

        tvResult.text = getString(R.string.result_format)


        btnAddition.setOnClickListener {
            val num1 = etNumber1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = etNumber2.text.toString().toDoubleOrNull() ?: 0.0

            val result = num1 + num2
            tvResult.text = getString(R.string.result, result)
        }

        btnSubtraction.setOnClickListener {
            val num1 = etNumber1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = etNumber2.text.toString().toDoubleOrNull() ?: 0.0
            val result = num1 - num2
            tvResult.text = getString(R.string.result, result)
        }

        btnMultiplication.setOnClickListener {
            val num1 = etNumber1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = etNumber2.text.toString().toDoubleOrNull() ?: 0.0
            val result = num1 * num2
            tvResult.text = getString(R.string.result, result)
        }

        btnDivision.setOnClickListener {
            val num1 = etNumber1.text.toString().toDoubleOrNull() ?: 0.0
            val num2 = etNumber2.text.toString().toDoubleOrNull() ?: 0.0
            val result = num1 / num2
            tvResult.text = getString(R.string.result, result)
        }

        btnClear.setOnClickListener {
            etNumber1.text.clear()
            etNumber2.text.clear()
            tvResult.text = getString(R.string.result_format)
        }



    }

}