package com.damdev;

public class Main {

  public static void main(String args[]) {
    String str = "1239";
    System.out.println(str + "는 숫자입니까? " + isNumber(str));

    str = "1234o";
    System.out.println(str + "는 숫자입니까? " + isNumber(str));
  }

  static boolean isNumber(String str) {
    boolean result = true;

    if (str == null || str.equals("")) {
      result = false;
    } else {
      for (int i = 0; i < str.length(); i++) {
        int n = (int) str.charAt(i);
        if (n < 49 || n > 57) {
          result = false;
          break;
        }
      }
    }

    return result;
  }

}
