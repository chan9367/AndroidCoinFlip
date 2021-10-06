package com.example.coinflip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flipCoinButton = findViewById<Button>(R.id.Flip)
        var headsOrTailsTextView = findViewById<TextView>(R.id.HoT)
        var randomNumber = 0

        flipCoinButton.setOnClickListener {
            randomNumber = (0..1).random()
            if (randomNumber == 0){
                headsOrTailsTextView.text = "Heads"
            }else{
                headsOrTailsTextView.text = "Tails"
            }
        }
    }
}