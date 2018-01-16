package com.mscbrain.practice;

public class ex09 {

  public static void ex9() {

    String str = "12345";
    int sum = 0;

    for (int i = 0; i < str.length(); i++) {
      sum += str.charAt(i) - 48;
    }

    System.out.println("sum=" + sum);

  }

}
