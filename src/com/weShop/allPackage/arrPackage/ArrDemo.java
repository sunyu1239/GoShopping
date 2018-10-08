package com.weShop.allPackage.arrPackage;

public class ArrDemo {

  public static void main(String[] args) {
    int[] a = new int[5];
    Arr[] arr = new Arr[5];

    int k = 0;
    int j = 0;
    for (int i = 0; i < 5; i++) {
      a[i] = i;
      Arr temp = new Arr();
      arr[i] = temp;
    }
    while (k < 5) {
      System.out.print(a[k]);
      k++;
    }
    System.out.println();
    while (j < 5) {
      System.out.print(arr[j] + ",");
      j++;
    }
  }

}

class Arr {

}