package com.projects.a02diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dice = Dice(6)
        val rollButton: Button = findViewById(R.id.button)
        val rolledTextView: TextView = findViewById(R.id.textView)
        diceImage = findViewById(R.id.imageView)

        rolledTextView.text = getString(R.string.click_roll)
        rollButton.setOnClickListener {
            val roll = dice.roll()
            rolledTextView.text = roll.toString()
            setDiceImage(roll)
        }
    }

    private fun setDiceImage(roll: Int) {
        when (roll) {
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            else -> diceImage.setImageResource(R.drawable.dice_6)
        }
        diceImage.contentDescription = roll.toString()
    }
}