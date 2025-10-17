package com.bhalash.ncirl.weekFive.bloodLab;

/**
 * You have been asked to develop an application that allows a user to enter
 * their age and blood type. The app will then display a message outlining which
 * blood groups the user can donate to and receive from. Please note that only
 * 18+ can donate. Use instantiable classes in your application.
 */
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
