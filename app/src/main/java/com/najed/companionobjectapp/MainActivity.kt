package com.najed.companionobjectapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    lateinit var constraintLayout: ConstraintLayout
    lateinit var dayNightEditText: EditText
    lateinit var changerButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        constraintLayout = findViewById(R.id.cl)
        dayNightEditText = findViewById(R.id.daynight_et)
        changerButton = findViewById(R.id.changer_btn)
        changerButton.setOnClickListener {
            when (dayNightEditText.text.toString().toLowerCase()) {
                "day" -> {
                    constraintLayout.setBackgroundResource(R.drawable.day1)
                }
                "night" -> {
                    constraintLayout.setBackgroundResource(R.drawable.night2)
                }
                else -> {
                    Toast.makeText(this, "Please enter either day or night", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}