package com.j2.wk4;

import java.awt.event.*;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

public class TurtleMouseListener extends Turtle{
  public TurtleMouseListener() {
   addMouseListener(new MouseAdapter(){ //anonymous
     public void mousePressed(MouseEvent e){
       Point2D.Double p; // 자바라서해줌
       //p = (Point2D.Double)e.getPoint(); 이렇게 캐스팅하면 안댐
       p = toTurtlePos(e.getPoint()); //거북이가 어디있는지 알려주는 함수를 만듬
       double d=distance(p);
       double w=towards(p);
       heading(w);
       forward(d);
       setStatusText("moving to "+p.toString()); // toString object값 가져오는거
     }   
     public void mouseReleased(MouseEvent e){
       int value = 0;
       if(value == 0) {
         value = 255;
       } else {
         value = 0;
       }
     }  
   });
   addMouseMotionListener(new MouseMotionAdapter(){
     public void mouseDragged(MouseEvent e){
       Point2D.Double p;
       p = toTurtlePos(e.getPoint()); //거북이가 어디있는지 알려주는 함수를 만듬
       moveTo(p);
       setStatusText("dragging to" + p.toString());
     }
     
   });
  }
}
