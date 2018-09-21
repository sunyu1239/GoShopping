package com.weShop.allPackage.setPackage;

public class SetDemo {
  public static void main(String[] args) {
    C c = new C();
    c.get();

  }
}

interface A {
  interface B {
    void set();
  }

  void get();
}

class C implements A {

  @Override
  public void get() {
    // TODO Auto-generated method stub
    System.out.println("sss");
  }

}
