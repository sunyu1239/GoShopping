package com.weShop.allPackage.implementsPackage;

public class TArgsDemo {
  public static void main(String[] args) {
    TArgsDemo t = new TArgsDemo();
    Fruit apple = new Fruit("apple");
    Fruit lemon = new Fruit("lemon");
    t.get(apple, lemon);

  }

  <T> void get(T... arr) {
    for (T f : arr) {
      System.out.println(f);
    }
  }
}

class Fruit {
  String name = null;

  public Fruit(String name) {
    this.name = name;
  }
}
