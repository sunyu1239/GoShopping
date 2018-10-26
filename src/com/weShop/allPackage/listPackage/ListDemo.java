package com.weShop.allPackage.listPackage;

import java.util.List;
import java.util.Set;

public class ListDemo {
  List l;
  Set s;

  public static void main(String[] args) {
    AAA a = new AAA();
    AAA c = new AAA(10);
    a.pro(c);
    System.out.println(c.b);
  }
}

class AAA {
  int b;

  public AAA() {
  }

  public AAA(int b) {
    this.b = b;
  }

  void pro(AAA b) {
    b.b = 20;
    System.out.println(b.b);
  }
}