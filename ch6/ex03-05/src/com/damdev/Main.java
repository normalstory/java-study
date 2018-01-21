package com.damdev;

public class Main {

  public static void main(String[] args) {
    // write your code here
    Student s = new Student();
    s.name = "홍길동";
    s.ban = 1;
    s.no = 1;
    s.kor = 100;
    s.eng = 60;
    s.math = 76;
    System.out.println("이름:" + s.name);
    System.out.println("총점:" + s.getTotal());
    System.out.println("평균:" + s.getAverage());

    s = new Student("홍길동", 1, 1, 100, 60, 76);

    System.out.println(s.info());
  }
}

class Student {

  String name;
  int ban;
  int no;
  int kor;
  int eng;
  int math;

  Student() {
  }

  Student(String name, int ban, int no, int kor, int eng, int math) {
    this.name = name;
    this.ban = ban;
    this.no = no;
    this.kor = kor;
    this.eng = eng;
    this.math = math;
  }

  int getTotal() {
    return kor + eng + math;
  }

  float getAverage() {
    return (int) ((((kor + eng + math) / 3f) * 10) + 0.5) / 10f;
  }

  String info() {
    return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + "," + getTotal() + ","
      + getAverage();
  }

}
