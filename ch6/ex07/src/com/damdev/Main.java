package com.damdev;

public class Main {

  public static void main(String[] args) {
    // write your code here
    MyPoint p = new MyPoint(1, 1);

    System.out.println(p.getDistance(2, 2));
  }
}

class MyPoint {

  int x;
  int y;

  MyPoint(int x, int y) {
    this.x = x;
    this.y = y;
  }

  double getDistance(int x1, int y1) {
    return Math.sqrt((y1 - y) + (x1 - x));
  }
}