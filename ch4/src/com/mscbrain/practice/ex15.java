package com.mscbrain.practice;

public class ex15 {

  public static void ex15() {

    int number = 12321;
    int tmp = number;

    int result = 0;

    while (tmp != 0) {
      result *= 10;
      result = result + tmp % 10;
      tmp = tmp / 10;
    }

    if (number == result) {
      System.out.println(number + "는 회문수 입니다.");
    } else {
      System.out.println(number + "는 회문수가 아닙니다.");
    }

  }

}
