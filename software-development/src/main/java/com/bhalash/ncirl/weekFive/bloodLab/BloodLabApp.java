package com.bhalash.ncirl.weekFive.bloodLab;

// INFO(mark 2025-10-16): Read user age and blood type. Notify them on from whom
// they can receive blooo, and if they are over 18, on to whom they can donate.
public class BloodLabApp {
  public static void main(String[] args) {
    printWelcome();

    final BloodInput input = new BloodInput();
    final BloodDonator donator = new BloodDonator();

    // input
    int age = input.readUserAge();
    BloodType bloodType = input.readUserBloodType();

    // process + output
    donator.donate(age, bloodType);
  }

  private static void printWelcome() {
    System.out.println(
      """

      Donatatron 1.0
      ------------
      Welcome to the blood donation app. Enter your age and blood type to
      determine who you can donate blood to, and receive blood from.
      """
    );
  }
}
