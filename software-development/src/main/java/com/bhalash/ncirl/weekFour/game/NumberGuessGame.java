package com.bhalash.ncirl.weekFour.game;

import java.util.Random;

// INFO(mark 2025-10-07): Handles the state of the number guess game and checks
// for win conditions.
public class NumberGuessGame {
  private final Random random = new Random();
  private int guessCount;
  private int guessesRemaining;
  private int maxNumber;
  private int secretNumber;
  private State state = State.IN_PROGRESS;

  public enum State {
    IN_PROGRESS,
    WON,
    LOST
  }

  NumberGuessGame(int guessCount, int maxNumber) {
    this.guessCount = guessCount;
    this.maxNumber = maxNumber;
    this.secretNumber = random.nextInt(this.maxNumber);
    this.guessesRemaining = this.guessCount;
  }

  public int getGuesses() {
    return this.guessesRemaining;
  }

  public int getMaxNumber() {
    return this.maxNumber;
  }

  public int getSecretNumber() {
    return this.secretNumber;
  }

  public boolean getGameWon() {
    return this.state == State.WON;
  }

  public State getState() {
    return this.state;
  }

  public boolean hasGuesses() {
    return this.state == State.IN_PROGRESS && this.guessesRemaining > 0;
  }

  // Test guess and update game state.
  public State makeGuess(int guess) {
    if (this.state == State.LOST) {
      return this.state;
    }

    if (guess == this.secretNumber) {
      this.state = State.WON;
      return this.state;
    }

    this.guessesRemaining--;

    if (this.hasGuesses()) {
      this.state = State.IN_PROGRESS;
      return this.state;
    }

    this.state = State.LOST;
    return this.state;
  }
}
