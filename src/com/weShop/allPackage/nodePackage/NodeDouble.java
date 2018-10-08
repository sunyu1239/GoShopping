package com.weShop.allPackage.nodePackage;

public class NodeDouble {
  public static void main(String[] args) {
    NodeD head = new NodeD();
    NodeD n1 = new NodeD(head, null, 20);
    head.nex = n1;
    NodeD tail = new NodeD(10);
    n1.nex = tail;
    tail.pre = n1;
    NodeD t = head;
    for (int i = 0; i < 3; i++) {

      System.out.println(t.data);
      t = t.nex;
    }

  }
}

class NodeD {
  int data;
  NodeD pre, nex;

  public NodeD() {

  }

  public NodeD(NodeD pre, NodeD nex, int data) {
    this.pre = pre;
    this.nex = nex;
    this.data = data;
  }

  public NodeD(int data) {
    this.data = data;
  }

}