package com.damdev;

public class Main {

  static int getRand(int from, int to) {
    int num = Math.abs(from - to);
    int rand = (int) (Math.random() * (num + 1));

    rand += Math.min(from, to);

    return rand;
  }

  public static void main(String[] args) {
    // write your code here
    for (int i = 0; i < 30; i++) {
      System.out.print(getRand(1, -3) + ",");
    }

    System.out.println();
    for (int i = 0; i < 30; i++) {
      System.out.print(getRand(2, 6) + ",");
    }

    System.out.println();
    for (int i = 0; i < 30; i++) {
      System.out.print(getRand(12, 16) + ",");
    }
  }
}
