package com.weShop.allPackage.implementsPackage;

public class TInterface {
  public static void main(String[] args) {
    B<String> b = new B<String>();

  }
}

interface A<T> {
  public T get();

  public void s();
}

class B<T> implements A<T> {
  int a = 10;
  T key;

  @Override
  public T get() {
    // TODO Auto-generated method stub
    return key;
  }

  @Override
  public void s() {
    // TODO Auto-generated method stub

  }
}

abstract class ss<T> {
  protected int a;
  T s;
}

class C implements A<String> {

  @Override
  public String get() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void s() {
    // TODO Auto-generated method stub

  }

}