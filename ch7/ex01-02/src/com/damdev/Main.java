package com.damdev;

public class Main {

  public static void main(String[] args) {
    // write your code here
    SutdaDeck deck = new SutdaDeck();

    System.out.println(deck.pick(0));
    System.out.println(deck.pick());
    deck.shuffle();

    for (int i = 0; i < deck.cards.length; i++) {
      System.out.print(deck.cards[i] + ",");
    }

    System.out.println();
    System.out.println(deck.pick(0));
  }
}

class SutdaCard {

  int num;
  boolean isKwang;

  SutdaCard() {
    this(1, true);
  }

  SutdaCard(int num, boolean isKwang) {
    this.num = num;
    this.isKwang = isKwang;
  }

  public String toString() {
    return num + (isKwang ? "K" : "");
  }

}

class SutdaDeck {

  final int CARD_NUM = 20;
  SutdaCard[] cards = new SutdaCard[CARD_NUM];

  SutdaDeck() {
    for (int i = 0; i < cards.length; i++) {
      boolean isKwang = false;
      if (i == 0 || i == 2 || i == 7) {
        isKwang = true;
      }
      cards[i] = new SutdaCard(i % 10 + 1, isKwang);
    }
  }

  void shuffle() {
    for (int i = 0; i < cards.length; i++) {
      SutdaCard temp = cards[i];
      int j = (int) (Math.random() * cards.length);
      cards[i] = cards[j];
      cards[j] = temp;
    }
  }

  SutdaCard pick(int index) {
    return cards[index];
  }

  SutdaCard pick() {
    return cards[(int) (Math.random() * cards.length)];
  }

}