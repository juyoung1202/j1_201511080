package com.j2.wk4;

  import com.j2.wk4.TurtleMouseListener;


public class TurtleMouseObserverMain {
  public static void main(String args[]){
    TurtleMouseListener t = new TurtleMouseListener();
    t.addStatusBar(20);
    t.setStatusText("Press any drag");
  
 } 
}
