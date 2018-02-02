package com.damdev;

public class Main {

  public static void main(String[] args) {
    // write your code here
    MyTv2 t = new MyTv2();
    t.setChannel(10);
    System.out.println("CH:" + t.getChannel());
    t.setVolume(20);
    System.out.println("VOL:" + t.getVolume());
  }
}

class MyTv2 {

  private boolean isPowerOn;
  private int channel;
  private int volume;

  final int MAX_VOLUME = 100;
  final int MIN_VOLUME = 0;
  final int MAX_CHANNEL = 100;
  final int MIN_CHANNEL = 1;

  public void setChannel(int channel) {
    this.channel = channel;
  }

  public int getChannel() {
    return this.channel;
  }

  public void setVolume(int volume) {
    this.volume = volume;
  }

  public int getVolume() {
    return this.volume;
  }
}