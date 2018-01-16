package com.mscbrain.practice;

public class ex08 {

  public static void ex8() {

    for (int i = 0; i < 11; i++) {
      for (int j = 0; j < 11; j++) {
        if (2 * i + 4 * j == 10) {
          System.out.printf("x=%d, y=%d\n", i, j);
        }
      }
    }

  }

}
