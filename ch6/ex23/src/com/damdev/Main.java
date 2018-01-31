package com.damdev;

public class Main {

  static int max(int[] arr) {

    int max = -999999;

    if (arr == null || arr.length == 0) {
      return max;
    }

    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
    }

    return max;
  }

  public static void main(String[] args) {
    // write your code here
    int[] data = {3, 2, 9, 4, 7};
    System.out.println(java.util.Arrays.toString(data));
    System.out.println("최대값:" + max(data));
    System.out.println("최대값:" + max(null));
    System.out.println("최대값:" + max(new int[]{})); // 크기가 0인 배열
  }
}
