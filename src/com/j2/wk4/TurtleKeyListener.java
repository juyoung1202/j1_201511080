package com.j2.wk4;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyPressed;


public class TurtleKeyListener extends Turtle{
  public TurtleKeyListener() {
   addKeyListener(new KeyAdapter(){ //anonymous
     public void keyPressed(KeyEvent e){
       
       int KeyCode=e.getKeyCode();
       switch(keyCode){
         case KeyEvent .VK_UP://vk_up이라는게 keyevent에 있음
           setStatuesText("forward 20");
           forward(20);
           break;
         case KeyEvent .VK_DOWN:
           setStatuesText("Down 20");
           back(20);
           break;
         case KeyEvent .VK_Q:
           setStatuesText("q press exiting 20");
           break;
         case KeyEvent .VK_LEFT:
           setStatuesText("forward 20");
           left(20);
           break;
         case KeyEvent .VK_RIGHT:
           setStatuesText("forward 20");
           right(20);
           break;
       }
     }   
   }); 
  }
}

public class TurtleKeyObserverMain {
  public static void main(String args[]){
    TurtleKeyListener t = new TurtleKeyListener();
    t.addStatusBar(20);
    t.setStatusText("Press any Key!");
  }
}
    
  
