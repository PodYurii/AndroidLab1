package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var but: Button
    private var Func: Func = Func()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numstr: TextView = findViewById(R.id.editTextNumberDecimal)
        val average: TextView = findViewById(R.id.editTextNumber)
        val except: TextView = findViewById(R.id.editTextNumber3)
        but = findViewById(R.id.button)
        but.setOnClickListener{
            Func.randAL()
            numstr.text = Func.getnumstr()
            average.text = Func.getavgstr()
            except.text = Func.getexcstr()
        }
    }
}