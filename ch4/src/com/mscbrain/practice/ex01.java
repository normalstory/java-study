package com.mscbrain.practice;

public class ex01 {

  public static void ex1() {

    int x = 15;
    // 1. int 형 변수 x가 10보다 크고 20보다 작을때 true 인 조건식
    System.out.println(x > 10 && x < 20);

    char ch = ' ';
    // 2. char 형 변수 ch가 공백이나 탭이 아닐 때 true 인 조건식
    System.out.println(ch == ' ' && ch == '\t');

    ch = 'x';
    // 3. char 형 변수 ch가 'x' 또는 'X'일 때 true 인 조건식
    System.out.println(ch == 'x' || ch == 'X');

    ch = '1';
    // 4. char 형 변수 ch가 숫자('0' ~ '9')일 때 true 인 조건식
    System.out.println(ch > 47 && ch < 58);

    ch = 'c';
    // 5. char 형 변수 ch가 영문자(대문자 또는 소문자)일 때 true 인 조건식
    System.out.println(ch > 64 && ch < 91 || ch > 96 && ch < 123);

    int year = 1988;
    // 6. int 형 변수 year 가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을 때 true 인 조건식
    System.out.println((year % 400 == 0 || year % 4 == 0) && year % 100 != 0);

    boolean powerOn = true;
    // 7. boolean 형 변수 powerOn가 false 일 때 true 인 조건식
    System.out.println(!powerOn);

    String str = "yes";
    // 8. 문자열 참조변수 str 이 "yes" 일 때 true 인 조건식
    System.out.println(str.equals("yes"));

  }
}
