package com.j2.wk11.Templete.TemplateCoffee;

public class BeverageTestDrive {
 public static void main(String[] args) {
 
  //비동적
  Tea tea = new Tea();
  Coffee coffee = new Coffee();
 
  System.out.println("\nMaking tea...");
  tea.prepareRecipe();
 
  System.out.println("\nMaking coffee...");
  coffee.prepareRecipe();

  //동적 hook 메소드
  TeaWithHook teaHook = new TeaWithHook();
  CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
  System.out.println("\nMaking tea...");
  teaHook.prepareRecipe();
 
  System.out.println("\nMaking coffee...");
  coffeeHook.prepareRecipe();
 }
}