package com.example.mytestappkotlin

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
//import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView
    private lateinit var diceImage2: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image2)
        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countButton: Button = findViewById(R.id.roll_count_up)
        countButton.setOnClickListener { default() }
    }

    private fun getRandomDiceImage(): Int {

        return when ((1..6).random()) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }

    private fun rollDice() {
//        Toast.makeText(
//            this, "button clicked",
//            Toast.LENGTH_SHORT
//        ).show()
        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
    }

    private fun default() {
        diceImage.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }
}