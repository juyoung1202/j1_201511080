package com.j2.wk11.Templete.Coffee;

public class Tea {
 
 void prepareRecipe() {
  boilWater();
  steepTeaBag();
  pourInCup();
  addLemon();
  endMaking();
 }
 public void endMaking(){
   System.out.println("----------complete------------");
 }
 public void boilWater() {
  System.out.println("Boiling water");
 }
 
 public void steepTeaBag() {
  System.out.println("Steeping the tea");
 }
 
 public void addLemon() {
  System.out.println("Adding Lemon");
 }
 
 public void pourInCup() {
  System.out.println("Pouring into cup");
 }
}