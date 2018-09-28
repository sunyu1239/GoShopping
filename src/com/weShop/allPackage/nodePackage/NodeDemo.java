package com.weShop.allPackage.nodePackage;

public class NodeDemo {
  Node head = null;
  Node[] arr = new Node[11];

  class Node {
    int data;
    Node next = null;

    Node() {

    }

    Node(int data) {
      this.data = data;
    }
  }

  // 添加节点
  boolean addNode(int data, int i) {
    boolean result = false;
    Node node = new Node(data);
    arr[i] = node;
    if (head == null) {
      head = node;
      result = true;
      System.out.println("first");
    } else {
      Node temp = head;
      while (temp.next != null) {
        temp = temp.next;
      }
      temp.next = node;
      result = true;
      System.out.println("last");
    }
    return result;
  }

  // 以头节点为基础，删除某个节点，需要遍历到匹配节点
  boolean deleteNode(int index) {
    if (index < 1 && index > getNodeLength()) {
      return false;
    }
    boolean result = false;
    Node preNode = null;
    Node curNode = null;
    if (index == 1) {
      head = head.next;
      result = true;
    } else {
      int i = 2;
      preNode = head;
      curNode = preNode.next;
      while (curNode != null) {
        if (i == index) {
          preNode.next = curNode.next;
          result = true;
          break;
        }
        preNode = curNode;
        curNode = preNode.next;
        i++;
      }
    }
    return result;
  }

  // 取得所有节点的个数
  int getNodeLength() {
    int index = 1;
    Node temp = head;
    while (temp.next != null) {
      temp = temp.next;
      index++;
    }
    return index;

  }

  // 不通过首节点遍历找点，直接删除某个节点，节点内容替换成下个节点的内容，达到删除目的
  boolean deleteNodeDirect(Node node) {
    boolean result = false;
    node.data = node.next.data;
    node.next = node.next.next;
    return result;
  }

  // 指定节点添加节点
  boolean addNodeDirect(Node nodeInit, Node node) {
    boolean result = false;
    Node temp = head;
    for (int i = 0; i < getNodeLength(); i++) {
      if (temp.data == nodeInit.data) {
        Node tempNode = temp.next;
        Node nn = new Node(node.data);
        temp.next = nn;
        nn.next = tempNode;
        result = true;
        break;
      }
      temp = temp.next;
    }
    return result;
  }

  // 指定位置添加节点
  boolean addNodeIndex(int index, int data) {
    boolean result = false;
    int i = 1;
    Node temp = head;
    while (i != index) {
      temp = temp.next;
      i++;
    }
    Node tempNode = temp.next;
    Node node = new Node(data);
    temp.next = node;
    node.next = tempNode;
    result = true;
    return result;
  }

  // 链表反转
  boolean NodeRevert() {
    boolean result = false;
    if (head == null || head.next == null)
      return true;
    Node temp = head;
    Node pre = null;
    Node fi = null;
    while (temp != null) {
      Node nexNode = temp.next;
      if (nexNode == null) {
        fi = temp;
        System.out.println("fi:" + fi);
      }
      temp.next = pre;
      pre = temp;
      temp = nexNode;
    }
    head = fi;
    // printRevertNode(head);
    System.out.println("headrev:" + this.head);
    return result;
  }

  // 打印所有节点数据
  void printNode() {
    Node temp = head;
    for (int i = 0; i < getNodeLength(); i++) {
      System.out.print("[" + temp.data + "] ");
      System.out.println("address" + i + ":" + temp);
      temp = temp.next;
    }
    System.out.println("head:" + this.head);
  }

  void printRevertNode(Node n) {
    for (int i = 0; i < 11; i++) {
      System.out.print("[" + n.data + "], ");
      System.out.println("addressrev" + i + ":" + n);
      n = n.next;
    }
  }

  public static void main(String[] args) {
    int data = 10;
    // 链表1的创建
    NodeDemo nd = new NodeDemo();
    // 链表2的创建
    NodeDemo nd2 = new NodeDemo();
    boolean result = false;
    for (int i = 0; i < 10; i++) {
      result = nd.addNode(data, i);
      nd2.addNode(data, i);
      data += 10;
      System.out.print(result + ",");
    }
    nd.addNode(100, 10);
    nd.printNode();
    System.out.println();
    // nd2.printNode();

    // 按照节点位置删除
    // nd.deleteNode(10);

    // 删除指定节点
    // Node node = nd.arr[8];
    // nd.deleteNodeDirect(node);

    // 指定节点处添加节点
    // Node nodeSource = nd.arr[3];
    // Node node = nd.arr[10];
    // nd.addNodeDirect(nodeSource, node);

    // 指定位置添加节点
    // nd.addNodeIndex(2, 50);

    result = nd.NodeRevert();
    System.out.println(result);
    nd.printNode();
  }
}
