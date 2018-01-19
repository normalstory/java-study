package com.mscbrain.practice;

public class ex13 {

  public static void ex13() {
    String value = "12o34";
    char ch;
    boolean isNumber = true;

    for (int i = 0; i < value.length(); i++) {
      ch = value.charAt(i);
      if (ch < 48 || ch > 57) {
        isNumber = false;
      }
    }

    if (isNumber) {
      System.out.println(value + "는 숫자입니다.");
    } else {
      System.out.println(value + "는 숫자가 아닙니다.");
    }
  }

}