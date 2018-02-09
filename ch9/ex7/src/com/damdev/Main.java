package com.damdev;

public class Main {

  static boolean contains(String src, String target) {

    if (src != null && src.indexOf(target) > 0) {
      return true;
    } else {
      return false;
    }
    
  }

  public static void main(String[] args) {
    // write your code here
    System.out.println(contains("12345", "23"));
    System.out.println(contains("12345", "67"));
  }
}
