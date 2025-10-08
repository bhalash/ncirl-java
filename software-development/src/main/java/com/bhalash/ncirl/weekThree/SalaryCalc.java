package com.bhalash.ncirl.weekThree;

public class SalaryCalc {
  private int monthlyWage;
  private int hoursWorkedPerWeek;
  private int yearlyWage;
  private int hourlyWage;

  private final int weeksInYear = 52;
  private final int monthsInYear = 12;
  private final int weeksInMonth = this.weeksInYear / this.monthsInYear;

  public void setSalaryDetails(int monthlyWage, int hoursPerWeek) {
    this.monthlyWage = monthlyWage;
    this.hoursWorkedPerWeek = hoursPerWeek;
  }

  public int getHourlyWage() {
    this.calculateHourlyWage();
    return this.hourlyWage;
  }

  public int getYearlyWage() {
    this.calculateYearlyWage();
    return this.yearlyWage;
  }

  private void calculateHourlyWage() {
    this.hourlyWage = this.monthlyWage / this.weeksInMonth / this.hoursWorkedPerWeek;
  }

  private void calculateYearlyWage() {
    this.yearlyWage = this.monthlyWage * this.monthsInYear;
  }
}
