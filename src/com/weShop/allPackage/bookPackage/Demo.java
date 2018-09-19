package com.weShop.allPackage.bookPackage;

public class Demo {

  public static void main(String[] args) {
    H<String> td = new H<String>();
    td.get();
    String a = "2";
    H<String> tds = new H<String>(a);
    tds.get();
    System.out.println(tds.getN() + "ss");
    H<Integer> tdi = new H<Integer>(10);
    tdi.get();
    tdi.getN();
    System.out.println(tdi.getN() + "ii");
    H h = new H("22");
    h.get();
  }
}

class H<T> {
  private int a = 20;
  private T as;

  public H() {

  }

  public H(T a) {
    this.as = a;
  }

  public void get() {
    System.out.println(a);
    System.out.println(as);
  }

  public T getN() {
    return as;

  }

}