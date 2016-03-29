package com.j2.wk4;

import java.awt.event.*;
import ch.aplu.turtle.*;
import java.awt.geom.Point2D;

public class TurtleMouseListener extends Turtle{
  public TurtleMouseListener() {
   addMouseListener(new MouseAdapter(){
     public void mousePressed(MouseEvent e){
       Point2D.Double p; 
       
       p = toTurtlePos(e.getPoint()); 
       double d=distance(p);
       double w=towards(p);
       heading(w);
       forward(d);
       setStatusText("moving to "+p.toString());
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
       p = toTurtlePos(e.getPoint()); 
       moveTo(p);
       setStatusText("dragging to" + p.toString());
     }
     
   });
  }
}
