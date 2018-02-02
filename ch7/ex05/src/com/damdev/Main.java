package com.damdev;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Tv t = new Tv();
  }
}


class Product {

  int price;
  int bonusPoint;

  Product() {
  }

  Product(int price) {
    this.price = price;
    bonusPoint = (int) (price / 10.0);
  }
}

class Tv extends Product {

  Tv() {
  }

  public String toString() {
    return "Tv";
  }
}