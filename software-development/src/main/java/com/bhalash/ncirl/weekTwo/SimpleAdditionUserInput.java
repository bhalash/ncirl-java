package com.bhalash.ncirl.weekTwo;

import javax.swing.JOptionPane;

public class SimpleAdditionUserInput {
  public static void main(String[] args) {
    int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the first number:"));
    int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the second number:"));
    int ans = x + y;
    System.out.println(Integer.toString(ans));
  }
}
