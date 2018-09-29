package com.weShop.allPackage.nodePackage;

public class NodeRever {

  public static void main(String[] args) {
    Node head = new Node();
    head.data = 0;
    Node temp = head;
    for (int i = 1; i < 10; i++) {
      Node n = new Node(i * 10);
      temp.next = n;
      temp = temp.next;
    }

  }

}

class Node {
  int data;
  Node next;

  public Node() {

  }

  public Node(int data) {
    this.data = data;
  }

}