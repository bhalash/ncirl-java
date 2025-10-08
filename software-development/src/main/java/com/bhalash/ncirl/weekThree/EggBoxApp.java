// fix the code by figuring out what should be in the **** sections
package com.bhalash.ncirl.weekThree;

import javax.swing.JOptionPane;

public class EggBoxApp {
  public static void main(String[] args) {
    //  variables
    final int boxSize = 6;
    final int eggCount = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number of eggs:"));

    //  objects
    final EggBox eggBox = new EggBox();

    // set
    eggBox.setEggs(eggCount);
    eggBox.setBoxSize(boxSize);

    // compute
    eggBox.computeBoxes();
    eggBox.computeLeftover();

    // get
    final int numBoxes = eggBox.getBoxes();
    final int leftOverEggs = eggBox.getLeftover();

    // output
    JOptionPane.showMessageDialog(null, "Number of boxes needed " + numBoxes);
    JOptionPane.showMessageDialog(null, "Number of eggs left over " + leftOverEggs);
  }
}
