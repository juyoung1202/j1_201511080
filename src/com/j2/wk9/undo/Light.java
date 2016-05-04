package com.j2.wk9.undo;

public class Light {
  int level;
  public Light() {
 }
  public void on(){
    level=100;
    System.out.println("Light on");
  }
  public void off(){
    level=0;
    System.out.println("Light off");
  }
  public void dim(int level){
   this.level = level;
   if(level==0){
    off(); 
   }
   else{
   System.out.println("Light dimmed to"+ level+"%");
   }
  }
  public int getLevel(){
    return level;
  }
                            
}