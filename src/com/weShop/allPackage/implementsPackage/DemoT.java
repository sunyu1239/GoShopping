package com.weShop.allPackage.implementsPackage;

public class DemoT {
  public class InnerDemo {

  }

  public static void main(String[] args) {
    D<Cat> d = new D<Cat>();
    Fish f = new Fish();
    Dog<Fish> dog = new Dog<Fish>();
    dog.set(f);
    Fish ff = d.name(dog);
    ff.get();
  }
}

class D<T> {
  T key1;

  public <M> M name(Dog<M> d) {
    M t1 = d.key;
    return t1;

  }
}

class Cat {

}

class Dog<T> {
  T key;

  void set(T key) {
    this.key = key;
  }
}

class Fish {
  void get() {
    System.out.println("success fidh");
  }
}