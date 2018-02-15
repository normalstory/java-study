package com.damdev;

public class Main {

  public static void main(String[] args) {
    // write your code here
    if (args.length < 2) {
      System.out.println("시작 단과 끝 단, 두개의 정수를 입력해주세요.");
      System.exit(0);
    }
    int start = Integer.parseInt(args[0]);
    int end = Integer.parseInt(args[1]);

    if (start < 2 || end > 9) {
      System.out.println("단의 범위는 2와 9 사이의 값이어야 합니다.");
      System.exit(0);
    }

    for (int i = start; i <= end; i++) {
      for (int j = 1; j < 10; j++) {
        System.out.printf("%d * %d = %d\n", i, j, i * j);
      }
      System.out.println();
    }
  }
}
