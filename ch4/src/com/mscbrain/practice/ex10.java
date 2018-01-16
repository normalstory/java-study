package com.mscbrain.practice;

public class ex10 {

  public static void ex10() {

    int num = 12345;
    int sum = 0;

    while (num > 0) {
      int m = num % 10;
      num = num / 10;

      sum += m;
    }

    System.out.println("sum=" + sum);

  }

}
