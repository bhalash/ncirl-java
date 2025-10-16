package com.bhalash.ncirl.weekFive.bloodLab;

// INFO(mark 2025-10-16): Assess blood donation from the user.
public class BloodDonator {
  private final int adultAge = 18;

  public void donate(int age, BloodType type) {
    System.out.println(
      """

      Thank you for using the blood donation calculator!
      You can receive blood of types(s): %s.
      %s
      """.formatted(this.canReceiveFrom(type), this.getDonationMessage(age, type))
    );
  }

  private String canReceiveFrom(BloodType type) {
    return switch (type) {
      case BloodType.AB -> "AB, A, B and O";
      case BloodType.A -> "A and O";
      case BloodType.B -> "B and O";
      case BloodType.O -> "O";
    };
  }

  private String canDonateTo(BloodType type) {
    return switch (type) {
      case BloodType.AB -> "AB";
      case BloodType.A -> "A and AB";
      case BloodType.B -> "B and AB";
      case BloodType.O -> "AB, A, B and O";
    };
  }

  private String getDonationMessage(int age, BloodType type) {
    if (age >= adultAge) {
      return "You can donate to blood type(s): " + this.canDonateTo(type) + ".";
    } else {
      return "You are unfortunately too young to donate blood, but thank you for your interest!";
    }
  }
}
