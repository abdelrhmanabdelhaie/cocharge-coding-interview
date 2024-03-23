package com.cocharge.rps

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test


class RockPaperScissorsGameTest {
     private lateinit var game: RockPaperScissorsGame

    @BeforeEach
    fun setUp() {
        game = RockPaperScissorsGame()
    }

    @Test
    fun testMultipleRounds() {
        game.playMultipleRounds(100)
        assertEquals(100, game.totalGames())
    }
}