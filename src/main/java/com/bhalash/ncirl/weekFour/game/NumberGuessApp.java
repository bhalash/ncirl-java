package com.bhalash.ncirl.weekFour.game;

public class NumberGuessApp {
  public static void main(String[] args) {
    final int maxGuesses = 5;
    final int maxRandom = 10;

    final NumberGuessGame game = new NumberGuessGame(maxGuesses, maxRandom);
    final GameRunner runner = new GameRunner(game);

    System.out.println("\nNumber Guess Game: Guess a number between 0 and " + maxRandom);
    System.out.println("=".repeat(12) + "\n");

    while (game.hasGuesses()) {
      int guess = runner.getNextGuess();
      NumberGuessGame.State result = game.makeGuess(guess);

      switch (result) {
        case NumberGuessGame.State.WON -> System.out.println("You've won, thanks for playing!\n");
        case NumberGuessGame.State.LOST -> System.out.println("You lost, better luck next time. :(\n");
        case NumberGuessGame.State.IN_PROGRESS -> System.out.println(runner.getWarmth(guess) + "\n");
      }
    }
  }
}
