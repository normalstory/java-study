package com.mscbrain.practice;

public class ex04 {

  public static void ex4() {

    int sum = 0;
    int i = 0;
    String str = "";

    while (sum < 100) {
      if (++i % 2 == 0) {
        sum += -i;
        str += "(" + -i + ") + ";
      } else {
        sum += i;
        str += i + " + ";
      }
    }

    System.out.println(str + "\b\b");
    System.out.println(i);

  }

}
