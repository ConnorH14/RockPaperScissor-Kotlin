package com.application.rockpaperscissortester

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Having issue with detecting button IDs in layout, using findViewById instead - need to fix issue
        val rockButton = findViewById<Button>(R.id.rock_button)
        val paperButton = findViewById<Button>(R.id.paper_button)
        val scissorButton = findViewById<Button>(R.id.scissor_button)

        val resultOfGame = findViewById<TextView>(R.id.result_of_game)
        val computerDisplay = findViewById<TextView>(R.id.computer_choice)
        val computerChoices = arrayOf("rock", "paper", "scissor")

        fun getResult(playerChoice: String): String {
            val computerChoice = (0..2).random()
            // updates computer's choice display
            computerDisplay.text = computerChoices[computerChoice]
            // checks to see who won game
            return if(computerChoices[computerChoice] == playerChoice) {
                "tie"
            } else if ((computerChoices[computerChoice] == "rock" && playerChoice == "paper") || (computerChoices[computerChoice] == "paper" && playerChoice == "scissor") || (computerChoices[computerChoice] == "scissor" && playerChoice == "rock")){
                "player wins"
            } else {
                "computer wins"
            }
        }

        // Listener for rock button clicked
        rockButton.setOnClickListener {
            resultOfGame.text = getResult("rock")
        }

        // Listener for paper button clicked
        paperButton.setOnClickListener {
            resultOfGame.text = getResult("paper")
        }

        // Listener for scissor button clicked
        scissorButton.setOnClickListener {
            resultOfGame.text = getResult("scissor")
        }

    }
}