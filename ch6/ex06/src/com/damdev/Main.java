package com.damdev;

public class Main {

  static double getDistance(int x, int y, int x1, int y1) {
    return Math.sqrt((y1 - y) + (x1 - x));
  }

  public static void main(String[] args) {
    // write your code here
    System.out.println(getDistance(1, 1, 2, 2));
  }
}
