package com.bhalash.ncirl.weekTwo;

import java.time.Year;
import javax.swing.JOptionPane;

public class YearOfBirth {
  public static void main(String[] args) {
    int age = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your age:"));
    int year = Year.now().getValue();
    int yearOfBirth = year - age;
    System.out.println("You were born in " + yearOfBirth + "!");
  }
}
