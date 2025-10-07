package com.bhalash.ncirl.weekFour;

import java.util.Scanner;
import java.util.InputMismatchException;

// INFO(mark 2025-10-07): Assess ten numbers for being positive or negative.
public class PositiveNegativeApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 10;

    System.out.println("Positive/Negative Number Checker");
    System.out.println("=".repeat(12));

    while (count > 0) {
      try {
        System.out.print("Enter a number (" + count + " remaining): ");
        PositiveNegativeApp.assessNumberType(scanner.nextInt());
      } catch (InputMismatchException e) {
        System.out.println("What even did you just enter?");
        scanner.next();
      } finally {
        count--;
      }
    }

    scanner.close();
  }

  private static void assessNumberType(Integer value) {
    String result = switch (value) {
      case Integer i when i > 0 -> "Number is positive.";
      case Integer i when i < 0 -> "Number is negative.";
      default -> "Number is zero.";
    };

    System.out.println(result);
  }
}
