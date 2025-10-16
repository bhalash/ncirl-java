package com.bhalash.ncirl.weekFive.bloodLab;

import java.util.Scanner;
import java.util.InputMismatchException;

// INFO(mark 2025-10-16): Poll the user for their age and blood type.
public class BloodInput {
  private final Scanner scanner = new Scanner(System.in);

  public BloodType readUserBloodType() {
    try {
      // INFO(mark 2025-10-16): I could solve this with scanner.next(/regex/),
      // but then I would have two problems...
      System.out.print("Your blood type (A, AB, B or O): ");
      return this.parseBloodType(this.scanner.next());
    } catch (InputMismatchException e) {
      System.out.println("Please input a valid blood type!");
      return this.readUserBloodType();
    }
  }

  public int readUserAge() {
    try {
      System.out.print("Your age: ");
      return this.scanner.nextInt();
    } catch (InputMismatchException e) {
      System.out.println("Please input a valid age!");
      this.scanner.next();
      return this.readUserAge();
    }
  }

  private BloodType parseBloodType(String inputType) throws InputMismatchException {
    return switch (inputType.trim().toUpperCase()) {
      case "AB" -> BloodType.AB;
      case "A" -> BloodType.A;
      case "B" -> BloodType.B;
      case "O" -> BloodType.O;
      default -> throw new InputMismatchException(inputType + " is not a valid blood group.");
    };
  }
}
