package com.cocharge.rps

/**
 * Class representing the Rock Paper Scissors game.
 */
class RockPaperScissorsGame {
    private var playerAWins = 0
    private var playerBWins = 0
    private var draws = 0

    /**
     * Plays the specified number of rounds of the game.
     *
     * @param numRounds The number of rounds to play.
     */
    fun playMultipleRounds(numRounds: Int) {
        for (i in 1..numRounds) {
            playRound()
        }
    }

    /**
     * Class representing the Rock Paper Scissors game.
     */
    private fun playRound() {
        val playerAMove = getRandomMove()
        val playerBMove = Move.ROCK

        val result = evaluateMoves(playerAMove, playerBMove)

        when (result) {
            Result.WIN -> playerAWins++
            Result.LOSE -> playerBWins++
            Result.DRAW -> draws++
        }
    }

    /**
     * Gets a random move from the available moves.
     *
     * @return A randomly chosen move.
     */
    private fun getRandomMove(): Move {
        val moves = Move.values()
        return moves.random()
    }

    /**
     * Evaluates the moves of Player A and Player B and determines the result of the round.
     *
     * @param moveA The move of Player A.
     * @param moveB The move of Player B.
     *
     * @return The result of the round.
     */
    private fun evaluateMoves(moveA: Move, moveB: Move): Result {
        return when {
            moveA == moveB -> Result.DRAW
            moveA == Move.ROCK && moveB == Move.SCISSORS -> Result.WIN
            moveA == Move.PAPER && moveB == Move.ROCK -> Result.WIN
            moveA == Move.SCISSORS && moveB == Move.PAPER -> Result.WIN
            else -> Result.LOSE
        }
    }

    fun totalGames(): Int = playerAWins + playerBWins + draws

    /**
     * Prints the final results of the game.
     */
    fun printResults() {
        val totalGames = totalGames()
        println("Player A wins $playerAWins of $totalGames games")
        println("Player B wins $playerBWins of $totalGames games")
        println("Draws: $draws of $totalGames games")
    }
}