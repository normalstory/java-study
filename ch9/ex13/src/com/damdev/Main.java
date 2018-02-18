package com.damdev;

public class Main {

  public static void main(String[] args) {
    // write your code here
    String src = "aabbccAABBCCaa";
    System.out.println(src);
    System.out.println("aa를 " + stringCount(src, "aa") + "개 찾았습니다.");
  }

  static int stringCount(String src, String key) {
    return stringCount(src, key, 0);
  }

  static int stringCount(String src, String key, int pos) {
    int count = 0;
    int index = 0;

    if (key == null || key.length() == 0) {
      return 0;
    }

    index = src.indexOf(key, pos);
    while (index != -1) {
      index = src.indexOf(key, ++index);
      count++;
    }

    return count;
  }
}
