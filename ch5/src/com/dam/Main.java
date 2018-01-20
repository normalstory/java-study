package com.dam;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void ex01() {

    System.out.println("1번 문제");
    int[] arr[] = {{1, 2}, {3, 4}, {5, 6}};
    for (int i = 0; i < arr.length; i++) {
      System.out.println(Arrays.toString(arr[i]));
    }
    int[] arr2 = {1, 2, 3,};
    System.out.println(Arrays.toString(arr2));

    int[] arr3[] = new int[3][];

    System.out.println();
  }

  public static void ex03() {

    System.out.println("3번 문제");

    int[] arr = {10, 20, 30, 40, 50};
    int sum = 0;

    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }

    System.out.println("sum=" + sum);
    System.out.println();

  }

  public static void ex04() {

    System.out.println("4번 문제");

    int[][] arr = {
      {5, 5, 5, 5, 5},
      {10, 10, 10, 10, 10},
      {20, 20, 20, 20, 20},
      {30, 30, 30, 30, 30}
    };
    int total = 0;
    float average = 0;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        total += arr[i][j];
      }
    }

    average = (float) total / (arr.length * arr[0].length);

    System.out.println("total=" + total);
    System.out.println("average=" + average);
    System.out.println();

  }

  public static void ex05() {

    System.out.println("5번 문제");

    int[] ballArr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int[] ball3 = new int[3];

    for (int i = 0; i < ballArr.length; i++) {
      int j = (int) (Math.random() * ballArr.length);
      int tmp = 0;

      tmp = ballArr[i];
      ballArr[i] = ballArr[j];
      ballArr[j] = tmp;
    }

    for (int i = 0; i < ball3.length; i++) {
      ball3[i] = ballArr[i];
    }

    for (int i = 0; i < ball3.length; i++) {
      System.out.print(ball3[i]);
    }

    System.out.println("\n");
  }

  public static void ex06() {

    System.out.println("6번 문제");

    int[] coinUnit = {500, 100, 50, 10};

    int money = 2680;
    System.out.println("money=" + money);

    for (int i = 0; i < coinUnit.length; i++) {
      System.out.println(coinUnit[i] + "원 : " + money / coinUnit[i]);
      money = money % coinUnit[i];
    }

    System.out.println();

  }

  public static void ex07(String[] args) {

    System.out.println("7번 문제");

    System.out.println("USAGE: java Exercise5_7 3120");
    if (args.length != 1) {
      System.exit(0);
    }

    int money = Integer.parseInt(args[0]);
    System.out.println("money=" + money);
    int[] coinUnit = {500, 100, 50, 10}; // 동전의 단위
    int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수

    for (int i = 0; i < coinUnit.length; i++) {
      int coinNum = 0;

      if (money == 0) {
        break;
      }

      if (money / coinUnit[i] <= coin[i]) {
        coinNum = money / coinUnit[i];
      } else {
        coinNum = coin[i];
      }

      money -= coinUnit[i] * coinNum;
      coin[i] = coin[i] - coinNum;

      System.out.println(coinUnit[i] + "원 : " + coinNum);
    }

    if (money > 0) {
      System.out.println("거스름돈이 부족합니다.");
      System.exit(0); // 프로그램을 종료한다.
    }

    System.out.println("=남은 동전의 개수 =");
    for (int i = 0; i < coinUnit.length; i++) {
      System.out.println(coinUnit[i] + "원:" + coin[i]);
    }

    System.out.println();

  }

  public static void ex08() {

    System.out.println("8번 문제");

    int[] answer = {1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2};
    int[] counter = new int[4];

    for (int i = 0; i < answer.length; i++) {
      /* (1) 알맞은 코드를 넣어 완성하시오. */
      counter[answer[i] - 1]++;
    }
    for (int i = 0; i < counter.length; i++) {
      /*
       (2) 알맞은 코드를 넣어 완성하시오.
      */
      System.out.print(counter[i]);
      for (int j = 0; j < counter[i]; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    System.out.println();
  }

  public static void ex09() {

    System.out.println("9번 문제");

    char[][] star = {{'*', '*', ' ', ' ', ' '}, {'*', '*', ' ', ' ', ' '},
      {'*', '*', '*', '*', '*'}, {'*', '*', '*', '*', '*'}
    };

    char[][] result = new char[star[0].length][star.length];
    for (int i = 0; i < star.length; i++) {
      for (int j = 0; j < star[i].length; j++) {
        System.out.print(star[i][j]);
      }
      System.out.println();
    }

    for (int i = 0; i < star.length; i++) {
      for (int j = 0; j < star[i].length; j++) {
        /*
        (1) 알맞은 코드를 넣어 완성하시오.
        */
        result[j][star.length - i - 1] = star[i][j];
      }
    }
    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.print(result[i][j]);
      }
      System.out.println();
    }

    System.out.println();

  }

  public static void ex10() {

    System.out.println("10번 문제");

    char[] abcCode =
      {'`', '~', '!', '@', '#', '$', '%', '^', '&', '*',
        '(', ')', '-', '_', '+', '=', '|', '[', ']', '{', '}', ';', ':', ',', '.', '/'};
    //0 1 2 3 4 5 6 7 8 9
    char[] numCode = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
    String src = "abc123";
    StringBuffer result = new StringBuffer();

    // 문자열 src의 문자를 charAt()으로 하나씩 읽어서 변환 후 result에 저장
    for (int i = 0; i < src.length(); i++) {
      char ch = src.charAt(i);
      /*
      (1) 알맞은 코드를 넣어 완성하시오.
      */
      if (ch > 47 && ch < 57) {
        result.append(numCode[(int) ch - 48]);
      } else {
        result.append(abcCode[(int) ch - 97]);
      }
    }
    System.out.println("src:" + src);
    System.out.println("result:" + result);
    System.out.println();
  }

  public static void ex11() {

    System.out.println("11번 문제");

    int[][] score = {
      {100, 100, 100},
      {20, 20, 20},
      {30, 30, 30},
      {40, 40, 40},
      {50, 50, 50}
    };

    int[][] result = new int[score.length + 1][score[0].length + 1];

    for (int i = 0; i < score.length; i++) {
      for (int j = 0; j < score[i].length; j++) {
        /*
        (1) 알맞은 코드를 넣어 완성하시오.
        */
        result[i][j] = score[i][j];
        result[i][3] += score[i][j];
        result[5][j] += score[i][j];
        result[5][3] += score[i][j];
      }
    }

    for (int i = 0; i < result.length; i++) {
      for (int j = 0; j < result[i].length; j++) {
        System.out.printf("%4d", result[i][j]);
      }
      System.out.println();
    }

    System.out.println();
  }

  public static void ex12() {

    System.out.println("12번 문제");

    String[][] words = {
      {"chair", "의자"},
      {"computer", "컴퓨터"},
      {"integer", "정수"}
    };

    int cnt = 0;
    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < words.length; i++) {
      System.out.printf("Q%d. %s의 뜻은?", i + 1, words[i][0]);

      String tmp = sc.nextLine();

      if (tmp.equals(words[i][1])) {
        System.out.println("정답입니다.\n");
        cnt++;
      } else {
        System.out.printf("틀렸습니다 정답은 %s입니다\n\n", words[i][1]);
      }
    }

    System.out.printf("전체 %d문제 중 %d문제 맞추셨습니다.\n\n", words.length, cnt);
    System.out.println();
  }

  public static void ex13() {

    System.out.println("13번 문제");

    String[] words = {"television", "computer", "mouse", "phone"};

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i < words.length; i++) {
      char[] question = words[i].toCharArray();

      for (int j = 0; j < question.length; j++) {
        int k = (int) Math.random() * question.length;
        char tmp = 0;
        tmp = question[j];
        question[j] = question[k];
        question[k] = tmp;
      }

      System.out.printf("Q%d. %s의 정답을 입력하세요.>", i + 1, new String(question));
      String answer = sc.nextLine();

      // trim()으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
      if (words[i].equals(answer.trim())) {
        System.out.printf("맞았습니다.%n%n");
      } else {
        System.out.printf("틀렸습니다.%n%n");
      }
    }
    System.out.println();
  }

  public static void main(String[] args) {
    // write your code here
    ex01();
    ex03();
    ex04();
    ex05();
    ex06();
    ex07(args);
    ex08();
    ex09();
    ex10();
    ex11();
    ex12();
    ex13();
  }
}
