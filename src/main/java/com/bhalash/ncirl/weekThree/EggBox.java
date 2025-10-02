package com.bhalash.ncirl.weekThree;

// fix the code by figuring out what should be in the **** sections
public class EggBox {
  // vars
  private int eggs;
  private int boxSize;

  private int numBoxes;
  private int leftOverEggs;

  // set
  public void setEggs(int eggs) {
    this.eggs = eggs;
  }

  public void setBoxSize(int boxSize) {
    this.boxSize = boxSize;
  }

  // compute
  public void computeBoxes() {
    numBoxes = eggs / this.boxSize;
  }

  public void computeLeftover() {
    this.leftOverEggs = this.eggs % this.boxSize;
  }

  // get
  public int getBoxes() {
    return this.numBoxes;
  }

  public int getLeftover() {
    return this.leftOverEggs;
  }
}
