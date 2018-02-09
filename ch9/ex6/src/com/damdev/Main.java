package com.damdev;

public class Main {

  public static void main(String[] args) {
    // write your code here
    String src = "12345";
    System.out.println(fillZero(src, 10));
    System.out.println(fillZero(src, -1));
    System.out.println(fillZero(src, 3));
  }

  public static String fillZero(String src, int length) {
    if (src == null || src.length() == length) {
      return src;
    } else if (length <= 0) {
      return "";
    } else if (src.length() > length) {
      return src.substring(0, length);
    }

    char[] arr = new char[length];

    StringBuffer sb = new StringBuffer();
    for (int i = 0; i < length; i++) {
      arr[i] = '0';
    }

    for (int i = 0; i < src.length(); i++) {
      arr[src.length() + i] = src.charAt(i);
    }

    for (int i = 0; i < length; i++) {
      sb.append(arr[i]);
    }

    return sb.toString();
  }
}
