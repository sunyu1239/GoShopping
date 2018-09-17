package com.weShop.allPackage.threadPackage;

public class SonDemo {
  public static void main(String[] args) {
    Father f = new Son();
    Son s = (Son) f;
    System.out.println(s.a);
    s.setFather();
  }

}

class Father {
  int a = 10;

  private int b = 20;

  public void setFather() {
    System.out.println("fff");
  }
}

class Son extends Father {
  int a = 20;

  @Override
  public void setFather() {
    System.out.println("sssfff");
  }

  public void setSon() {
    System.out.println("sss");
  }
}