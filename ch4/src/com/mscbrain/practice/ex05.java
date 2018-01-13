package com.mscbrain.practice;

public class ex05 {

  public static void ex5() {
    int i = 0;
    while (i <= 10) {
      int j = 0;
      while (j <= i) {
        System.out.print("*");
        j++;
      }
      System.out.println();
      i++;
    }
  }

}
