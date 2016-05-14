package com.j2.wk11.SmartHome;

public class Computer{
  public void on(){
    System.out.println("Computer on...");
  }
  public void off(){
    System.out.println("Computer off...");
  }
  public void setComputer(Computer computer) {
        System.out.println(computer+" set");
  }
  public void gameComputer(String game) {
        System.out.println(game+" gameplay");
  }
}