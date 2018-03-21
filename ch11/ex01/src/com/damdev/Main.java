package com.damdev;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    // write your code here
    ArrayList list1 = new ArrayList();
    ArrayList list2 = new ArrayList();
    ArrayList kyo = new ArrayList();
    ArrayList cha = new ArrayList();
    ArrayList hap = new ArrayList();

    list1.add(1);
    list1.add(2);
    list1.add(3);
    list1.add(4);

    list2.add(3);
    list2.add(4);
    list2.add(5);
    list2.add(6);

    // 교집합
    kyo.addAll(list1);
    kyo.retainAll(list2);

    // 차집합
    cha.addAll(list1);
    cha.removeAll(list2);

    // 합집합
    hap.addAll(cha);
    hap.addAll(list2);

    System.out.println("list1=" + list1);
    System.out.println("list2=" + list2);
    System.out.println("kyo=" + kyo);
    System.out.println("cha=" + cha);
    System.out.println("hap=" + hap);
  }
}
