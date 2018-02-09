package com.damdev;

public class Main {

  public static void main(String[] args) {
    // write your code here
    throw new UnsupportedFunctionException("지원하지 않는 기능입니다.", 100);
  }
}

class UnsupportedFunctionException extends RuntimeException {

  final private int ERR_CODE;

  UnsupportedFunctionException(String msg, int code) {
    super(msg);
    ERR_CODE = code;
  }

  public int getErrorCode() {
    return this.ERR_CODE;
  }

  public String getMessage() {
    return "[" + getErrorCode() + "]" + super.getMessage();
  }
}