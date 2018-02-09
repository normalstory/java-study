package com.damdev;

public class Main {

  public static void main(String[] args) {
    // write your code here
    SutaCard c1 = new SutaCard(3, true);
    SutaCard c2 = new SutaCard(3, true);

    System.out.println("c1 = " + c1);
    System.out.println("c2 = " + c2);
    System.out.println("c1.equals(c2) : " + c1.equals(c2));
  }
}


class SutaCard {

  int num;
  boolean isKwang;

  SutaCard() {
    this(1, true);
  }

  SutaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }

  public boolean equals(Object obj) {
    String str = num + (isKwang ? "K" : "");
    return str.equals(obj.toString());
  }

  public String toString() {
    return num + (isKwang ? "K" : "");
  }
}