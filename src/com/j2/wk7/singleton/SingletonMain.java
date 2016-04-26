package com.j2.wk7.singleton;

public class SingletonMain {
 public static void main(String[] args) {
  Singleton singleton1 = Singleton.getInstance();
  Singleton singleton2 = Singleton.getInstance();
  Singleton singleton3 = Singleton.getInstance();
  System.out.println(singleton3);
 }
}