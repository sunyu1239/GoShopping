package com.weShop.allPackage.nodePackage;

public class NodeDo {
  public static void main(String[] args) {
    NodeA head = new NodeA();
    NodeA pre = head;
    NodeA temp = head;
    NodeA tail = null;
    for (int i = 0; i < 10; i++) {
      int a1 = (int) (Math.random() * 100);
      NodeA n1 = new NodeA(a1);
      System.out.print(a1 + "," + n1);
      System.out.println();
      if (i == 0) {
        temp.previous = null;
        temp.next = n1;
      } else {
        temp.previous = pre;
        temp.next = n1;
      }
      if (i == 9) {
        n1.previous = temp;
        n1.next = null;
        tail = n1;
      }
      pre = temp;
      temp = temp.next;

    }
    System.out.println();
    int g = 0;
    NodeA t = head;
    while (g < 11) {
      System.out.println(t.data + "：pre " + t.previous + ", nex " + t.next);
      t = t.next;
      g++;
    }
    System.out.println();
    int k = 0;
    while (k < 11) {
      System.out.println(tail.data + "：pre " + tail.previous + ", nex " + tail.next);
      tail = tail.previous;
      k++;
    }
  }
}

class NodeA {
  int data;
  NodeA previous;
  NodeA next;

  public NodeA(int data) {
    this.data = data;
  }

  public NodeA() {

  }
}