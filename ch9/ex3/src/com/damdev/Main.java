package com.damdev;

public class Main {

  public static void main(String[] args) {
    // write your code here
    String fullPath = "c:\\jdk1.8\\work\\PathSeparateTest.java";
    String path;
    String fileName;

    String[] strArr = fullPath.split("\\\\");
    path = strArr[0] + "\\" + strArr[1] + "\\" + strArr[2];
    fileName = strArr[3];

    System.out.println("fullPath : " + fullPath);
    System.out.println("path : " + path);
    System.out.println("filename : " + fileName);
  }
}
