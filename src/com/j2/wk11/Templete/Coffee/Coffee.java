package com.j2.wk11.Templete.Coffee;

public class Coffee {
 
 void prepareRecipe() {
  boilWater();
  brewCoffeeGrinds();
  pourInCup();
  addSugarAndMilk();
  endMaking();
 }
 
 public void boilWater() {
  System.out.println("Boiling water");
 }
 
 public void brewCoffeeGrinds() {
  System.out.println("Dripping Coffee through filter");
 }
 
 public void pourInCup() {
  System.out.println("Pouring into cup");
 }
 
 public void addSugarAndMilk() {
  System.out.println("Adding Sugar and Milk");
 }
 public void endMaking(){
   System.out.println("----------complete------------");
 }
}