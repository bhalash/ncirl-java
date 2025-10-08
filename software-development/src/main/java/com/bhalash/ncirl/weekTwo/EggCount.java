package com.bhalash.ncirl.weekTwo;

import javax.swing.JOptionPane;

public class EggCount {
  public static void main(String[] args) {
    final int eggsPerCarton = 6;
    final int eggCount = Integer.parseInt(JOptionPane.showInputDialog(null, "How many eggs were laid?"));

    if (eggCount < 1) {
      System.out.println("No eggs? Really? A farmer of your talent?");
      return;
    }

    int cartonsNeeded = eggCount / eggsPerCarton;
    int eggsRemaining = eggCount % eggsPerCarton;
    System.out.println("You will need " + cartonsNeeded + " carton(s) for your eggs.");
    System.out.println("You will have " + eggsRemaining + " egg(s) remaining without cartons.");
  }
}
