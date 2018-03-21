package com.damdev;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args) {
    // write your code here
    ArrayList list = new ArrayList();
    list.add(3);
    list.add(6);
    list.add(2);
    list.add(2);
    list.add(2);
    list.add(7);
    list.add(3);

    HashSet set = new HashSet(list);
    TreeSet tset = new TreeSet(set);
    Stack stack = new Stack();
    stack.addAll(tset);

    while (!stack.empty()) {
      System.out.println(stack.pop());
    }

    /**
     * 출력 결과
     * 7
     * 6
     * 3
     * 2
     */
  }
}
