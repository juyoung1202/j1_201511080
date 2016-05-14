package com.j2.wk11.SmartHome;

public class Light{
  String level;
  public void on(){
    System.out.println("light on...");
  }
  public void off(){
    System.out.println("light off...");
  }
  public void setlevel(String level) {
        System.out.println(level+" level");
        this.level =  level;
  }
}