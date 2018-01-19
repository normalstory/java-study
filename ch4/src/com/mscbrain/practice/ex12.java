package com.mscbrain.practice;

public class ex12 {

  public static void ex12() {

    for (int i = 0; i < 8; i += 3) {
      for (int j = 1; j < 4; j++) {
        for (int k = 2; k < 5; k++) {
          if (k + i < 10) {
            System.out.printf("%d*%d=%-6d", k + i, j, (k + i) * j);
          }
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
