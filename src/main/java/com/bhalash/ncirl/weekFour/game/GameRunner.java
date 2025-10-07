package com.bhalash.ncirl.weekFour.game;

import java.util.Scanner;
import java.util.InputMismatchException;

// INFO(mark 2025-10-07): I pulled out some utility-type code here for the
// sake of cleanliness. I wanted to keep the main class focused on running the
// game, not the game itself, or polling the user for guesses.
public class GameRunner {
  private final Scanner scanner = new Scanner(System.in);
  private final NumberGuessGame game;

  GameRunner(NumberGuessGame game) {
    this.game = game;
  }

  // Poll user for next guess.
  public int getNextGuess() {
    try {
      System.out.print("Next guess (" + this.game.getGuesses() + " guesses remain): ");
      return this.scanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Invalid character entered.");
      this.scanner.next();
      return -100;
    }
  }

  // How close is the guess to the secret?
  public String getWarmth(int guess) {
    int secret = this.game.getSecretNumber();
    Integer warmth = Math.abs(secret - guess); // lower is closer/warmer

    return switch (warmth) {
      case Integer w when w < 2 -> "On fire!";
      case Integer w when w < 4 -> "Warmer";
      case Integer w when w < 6 -> "Warm";
      case Integer w when w < 8 -> "Cold";
      default -> "So very very cold :(";
    };
  }
}
