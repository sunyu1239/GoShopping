package com.weShop.allPackage.threadPackage;

public class ThreadDemo {

  public static void main(String[] args) {
    Runnable thread1 = new Thread1();
    Runnable thread2 = new Thread1();
    Thread t1 = new Thread(thread1);
    Thread t2 = new Thread(thread2);
    String name = Thread.currentThread().getName();
    System.out.println("'" + name + "'");
    t1.start();
    t2.start();
    try {
      Thread.sleep(50000);
    } catch (InterruptedException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    System.out.println("'" + name + "'");
  }

}

class Thread1 implements Runnable {

  @Override
  public void run() {
    // TODO Auto-generated method stub
    String name = Thread.currentThread().getName();
    for (int i = 0; i < 10; i++) {
      System.out.println("'" + name + "':" + i);
    }
  }

}

class Thread2 extends Thread {

}
