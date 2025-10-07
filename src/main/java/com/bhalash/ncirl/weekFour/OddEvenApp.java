package com.bhalash.ncirl.weekFour;

import java.util.Scanner;
import java.util.InputMismatchException;

// INFO(mark 2025-10-07): Assess ten numbers for being odd or even.
public class OddEvenApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int count = 10;

    System.out.println("Odd/Even Number Checker");
    System.out.println("=".repeat(12));

    while (count > 0) {
      try {
        System.out.print("Enter a number (" + count + " remaining): ");
        OddEvenApp.assessNumberType(scanner.nextInt());
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
      case Integer i when i % 2 == 0 -> "Number is even.";
      default -> "Number is odd.";
    };

    System.out.println(result);
  }
}
