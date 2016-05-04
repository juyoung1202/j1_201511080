package com.j2.wk9.party;

public class Light {
  String location;
  int level;
  public Light(String location) {
  this.location = location;
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
    System.out.println("---undo---");
    off(); 

   }
   else if (level==100){
         System.out.println("---undo---");
   on();
   }
  }
  public int getLevel(){
    return level;
  }
                            
}