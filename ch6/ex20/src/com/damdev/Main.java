package com.damdev;

public class Main {

  static int[] shuffle(int[] arr) {

    for (int i = 0; i < arr.length; i++) {
      int temp = arr[i];
      int j = (int) (Math.random() * arr.length);
      arr[i] = arr[j];
      arr[j] = temp;
    }

    return arr;
  }

  public static void main(String[] args) {
    // write your code here
    int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};

    System.out.println(java.util.Arrays.toString(original));

    int[] result = shuffle(original);

    System.out.println(java.util.Arrays.toString(result));
  }
}
