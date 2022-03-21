package com.example.mytestappkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.roll_count_up)
        countButton.setOnClickListener { countUp() }
    }

    private fun rollDice() {
        Toast.makeText(
            this, "button clicked",
            Toast.LENGTH_SHORT
        ).show()
        val randomInt = (1..9).random()
        val rollText: TextView = findViewById(R.id.roll_text)
        rollText.text = randomInt.toString()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.roll_text)

        // If text is the default "Hello World!" set that text to 1.
        val defaultInt: Int = 1;
        if (resultText.text == "Dice Roll") {
            resultText.text = 1.toString()
        } else {
            // Otherwise, increment the number up to 6.
            // The text value in resultText.text is an instance of the CharSequence class;
            // it needs to be converted to a String object before it can be converted to an int.
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 9) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }
    }
}