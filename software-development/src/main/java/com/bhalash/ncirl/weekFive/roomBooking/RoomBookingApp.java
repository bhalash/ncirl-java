package com.bhalash.ncirl.weekFive.roomBooking;

/**
 * Develop an application that allows the user to book a hotel room. The user
 * should be asked for their name, the required number of nights, and their age.
 * The application should assume that each room costs 90 euro per night and then
 * calculate and output the total cost to confirm the booking. Please note: a
 * booking can only be confirmed if the user is at least 18.
 */
public class RoomBookingApp {
  public static void main(String[] args) {
    printWelcome();

    BookingInput input = new BookingInput();
    BookingProcessor processor = new BookingProcessor();

    String name = input.readUserName();
    int nights = input.readNightsToStay();
    int age = input.readUserAge();

    processor.bookRoom(name, age, nights);
  }

  private static void printWelcome() {
    System.out.println(
      """

      Hotel Bookatron 1.0
      ------------
      Welcome to the hotel booking app. Enter your details to book a room.
      """
    );
  }
}
