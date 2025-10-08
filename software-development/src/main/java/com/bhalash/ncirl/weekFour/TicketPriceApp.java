package com.bhalash.ncirl.weekFour;

import java.util.Scanner;
import java.util.InputMismatchException;

public class TicketPriceApp {
  public static void main(String[] args) {
    System.out.println("Cinema Ticket Price Calculator");
    System.out.println("=".repeat(12));

    final Scanner scanner = new Scanner(System.in);
    final int userAge = getUserAge(scanner);
    final int adultAgeCutoff = 18;
    final int adultTicketPrice = 15;
    final int childTicketPrice = 10;

    if (userAge < adultAgeCutoff) {
      System.out.println("\nYour ticket price is: €" + childTicketPrice);
    } else {
      System.out.println("\nYour ticket price is: €" + adultTicketPrice);
    }

    scanner.close();
  }

  private static int getUserAge(Scanner scanner) {
    try {
      System.out.print("Enter your age: ");
      return scanner.nextInt();
    } catch (InputMismatchException e) {
      scanner.next();
      System.out.println("Ha ha, very funny.\n");
      return TicketPriceApp.getUserAge(scanner);
    }
  }
}
