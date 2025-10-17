package com.bhalash.ncirl.weekFive.roomBooking;

public class BookingProcessor {
  private final int roomCostPerNight = 90;
  private final int adultAge = 18;

  public void bookRoom(String name, int age, int nights) {
    if (age < this.adultAge) {
      rejectChildren();
      return;
    }

    System.out.println(
      """

      Thank you %s for making a %s night booking at our hotel.
      The total cost of your stay will be €%s.
      """.formatted(name, nights, this.getTotalRooomCost(nights))
    );
  }

  private int getTotalRooomCost(int nights) {
    return nights * this.roomCostPerNight;
  }

  private void rejectChildren() {
    System.out.println("""

      Thank you for your interest, but you must be older than %s to book a
      room at our hotel.
    """.formatted(this.adultAge)
    );
  }
}
