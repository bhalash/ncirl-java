package com.bhalash.ncirl.weekFive.roomBooking;

import java.util.Scanner;
import java.util.InputMismatchException;

// INFO(mark 2025-10-16): Poll the user for their age and blood type.
public class BookingInput {
  private final Scanner scanner = new Scanner(System.in);

  public String readUserName() {
    try {
      System.out.print("Your name: ");
      return this.scanner.next();
    } catch (InputMismatchException e) {
      System.out.println("Please input a valid age!");
      // this.scanner.next();
      return this.readUserName();
    }
  }

  public int readNightsToStay() {
    try {
      System.out.print("How many nights will you stay: ");
      int nights = this.scanner.nextInt();

      if (nights < 1) {
        throw new InputMismatchException("Number of nights should be at least 1");
      }

      return nights;
    } catch (InputMismatchException e) {
      System.out.println("Please input a valid number of nights!");
      // this.scanner.next();
      return this.readNightsToStay();
    }
  }

  public int readUserAge() {
    try {
      System.out.print("Your age: ");
      return this.scanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Please input a valid age!");
      // this.scanner.next();
      return this.readUserAge();
    }
  }
}
