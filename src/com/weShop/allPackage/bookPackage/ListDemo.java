package com.weShop.allPackage.bookPackage;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
  public static void main(String[] args) {
    List s = new ArrayList();
    s.add("aaaa");
    s.add(100);

    for (int i = 0; i < s.size(); i++) {
      // String item = (String) s.get(i);
      s.get(i);
    }
  }
}
