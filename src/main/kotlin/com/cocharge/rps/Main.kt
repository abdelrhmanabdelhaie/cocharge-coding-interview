package com.cocharge.rps

/**
 * Main function to run the Rock Paper Scissors game.
 */
fun main() {
    val game = RockPaperScissorsGame()
    game.playMultipleRounds(100)
    game.printResults()
}