package com.damdev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

  public static void main(String[] args) {
    // write your code here
    String[] phoneNumber = {
      "012-3456-7890",
      "099-2456-7980",
      "088-2346-9870",
      "013-3456-7890"
    };

    ArrayList list = new ArrayList();
    Scanner s = new Scanner(System.in);

    while (true) {
      System.out.print(">>");
      String input = s.nextLine().trim();

      if (input.equals("")) {
        continue;
      } else if (input.equalsIgnoreCase("Q")) {
        System.exit(0);
      }

      Pattern p = Pattern.compile(".*" + input + ".*");
      for (int i = 0; i < phoneNumber.length; i++) {
        Matcher m = p.matcher(phoneNumber[i].replace("-", ""));
        if (m.matches()) {
          list.add(phoneNumber[i]);
        }
      }

      if (list.size() > 0) {
        System.out.println(Arrays.toString(list.toArray()));
        list.clear();
        continue;
      }

      if (list.size() > 0) {
        System.out.println(list);
        list.clear();
      } else {
        System.out.println("일치하는 번호가 없습니다.");
      }
    }

  }
}
