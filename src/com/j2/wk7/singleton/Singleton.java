package com.j2.wk7.singleton;

public class Singleton {
 private static Singleton uniqueInstance; 
 //private static Singleton uniqueInstance = new Singleton(); lzay 방식 사용
 private static int numCalled=0;
 
 private Singleton() {}
 
 public static synchronized Singleton getInstance() { //synchronize 메소드 출입을 막음
  if (uniqueInstance == null) { //instance에 직접 선언하여서 필요가 없음
    uniqueInstance = new Singleton();
  }
  System.out.println("numCalled: " + numCalled++);
  return uniqueInstance;
 }
 
}