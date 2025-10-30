package com.bhalash.ncirl.weekSix.beerBottle;

/**
 * INFO(mark 2025-10-26): Generate the lyrics for "99 Bottles of Beer".
 * @see https://www.songfacts.com/lyrics/traditional/99-bottles-of-beer
 */
public class BeerBottleApp {
  public static void main(String[] args) {
    System.out.println("\n99 Bottles of Beer: A Song in 20 Lines of Code");
    System.out.println("=".repeat(12) + "\n");

    for (int i = 99; i > 0; i--) {
      printVerse(i);
    }
  }

  private static void printVerse(int bottle) {
    String nextBottle = switch (bottle) {
      case 2  -> "1 bottle";
      case 1  -> "no more bottles";
      default -> (bottle - 1) + " bottles";
    };

    System.out.println(bottle + " bottles of beer on the wall, " + bottle + " bottles of beer");
    System.out.println("Take one down and pass it around, " + nextBottle + " of beer on the wall\n");
  }
}
