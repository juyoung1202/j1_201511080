package com.j2.wk11.Templete.TemplateCoffee;

public abstract class CaffeineBeverageWithHook {
  public void prepareRecipe(){
   boilWater();
   brew();
   pourInCup();
   if(customerWantsCondiments()){
    addCondiments(); 
   }
   endMaking();
  }
  public abstract void brew();
 
  public abstract void addCondiments();
 
  public void boilWater() {
    System.out.println("Boiling water");
  }
 
  public void pourInCup() {
    System.out.println("Pouring into cup");
  }
 
  public boolean customerWantsCondiments() {
    return true;
  }
  public void endMaking(){
    System.out.println("stop Making------");
  }
}