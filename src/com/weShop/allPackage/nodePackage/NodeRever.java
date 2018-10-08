package com.weShop.allPackage.nodePackage;

public class NodeRever {

  public static void main(String[] args) {
    Node head = new Node();
    head.data = 0;
    Node temp = head;
    for (int i = 1; i < 10; i++) {
      Node n = new Node((int) (Math.random() * 100));
      temp.next = n;
      temp = temp.next;
    }
    head.printNode(head);
    head.sortNodeAsc(head);
    head.printNode(head);
    head.deleteDuplemcat(head);
    head.printNode(head);
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

  void printNode(Node node) {
    node = node.next;
    while (node != null) {
      System.out.print("[" + node.data + "]");
      node = node.next;
    }
    System.out.println();
  }

  // Node 升序
  void sortNodeAsc(Node node) {
    int count = 9;
    int num = 0;
    for (int i = 0; i < 8; i++) {
      Node temp = node.next;
      int index = 0;
      while (temp != null && temp.next != null) {
        if (temp.data > temp.next.data) {
          int tempdata = temp.data;
          temp.data = temp.next.data;
          temp.next.data = tempdata;
        }
        temp = temp.next;
        index++;
        if (count == index)
          break;
        num++;
      }
      count--;
    }
    System.out.println(num);
  }

  // 删除重复
  void deleteDuplemcat(Node node) {
    node = node.next;
    while (node != null) {
      if (node.data == node.next.data) {
        node.next = node.next.next;
      }
      node = node.next;
    }

  }
}