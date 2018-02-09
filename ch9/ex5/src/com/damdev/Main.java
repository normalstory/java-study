package com.damdev;

public class Main {

  public static void main(String[] args) {
    // write your code here
    System.out.println(count("12345AB12AB345AB", "AB"));
    System.out.println(count("12345", "AB"));
  }

  public static int count(String src, String target) {
    int count = 0;
    int pos = 0;

    while (src.indexOf(target, pos) > 0) {
      count++;
      pos = src.indexOf(target, pos) + 1;
    }

    return count;
  }
}
