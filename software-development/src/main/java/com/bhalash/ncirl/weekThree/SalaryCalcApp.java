package com.bhalash.ncirl.weekThree;

import javax.swing.JOptionPane;

// Create an application that takes in a user's monthly wage and weekly hours
// and calculates how much they make per year and per hour
public class SalaryCalcApp {
  public static void main(String[] args) {
    final int monthlyWage = Integer.parseInt(JOptionPane.showInputDialog(null, "How much do you earn per month?"));
    final int weeklyHours = Integer.parseInt(JOptionPane.showInputDialog(null, "How many hours do you work per week?"));
    final SalaryCalc calc = new SalaryCalc();

    if (monthlyWage < 1) {
      System.out.println("No salary? I don't believe you.");
      return;
    }

    if (weeklyHours < 1) {
      System.out.println("Ahh, the life of beautiful indolence.");
      return;
    }

    calc.setSalaryDetails(monthlyWage, weeklyHours);

    JOptionPane.showMessageDialog(null, "Your hourly wage: " + calc.getHourlyWage());
    JOptionPane.showMessageDialog(null, "Your annual wage: " + calc.getYearlyWage());
  }
}
