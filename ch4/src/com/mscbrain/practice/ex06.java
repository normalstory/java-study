package com.mscbrain.practice;

public class ex06 {

  public static void ex6() {

    for (int i = 1; i < 7; i++) {
      for (int j = 1; j < 7; j++) {
        if (i + j == 6) {
          System.out.printf("%d + %d = %d", i, j, (i + j));
        }
      }
      System.out.println();
    }

  }

}
