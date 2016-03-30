package com.j2.wk4;

public class TurtleKeyObserverMain{
  public static void main(String[] args){
    TurtleKeyListener t = new TurtleKeyListener();
    t.addStatusBar(20);
    t.setStatusText("Press Any Key!");
  }
}
