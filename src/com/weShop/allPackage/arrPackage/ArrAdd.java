package com.weShop.allPackage.arrPackage;

public class ArrAdd {
  public static void main(String[] args) {
    int length = 5;
    int[] a = new int[10];
    for (int i = 0; i < 5; i++) {
      a[i] = (int) (Math.random() * 10);
      System.out.print(a[i] + ",");
    }
    ArrAdd s = new ArrAdd();
    s.insertNum(3, 999, a, length);
    System.out.println();
    int g = 0;
    while (g < a.length) {
      System.out.print(a[g] + ",");
      g++;
    }

  }

  void insertNum(int index, int data, int[] a, int length) {
    for (int i = length - 1; i >= index - 1; i--) {
      a[i + 1] = a[i];
    }
    a[index - 1] = data;
  }

}
