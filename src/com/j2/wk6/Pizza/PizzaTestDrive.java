package com.j2.wk6.Pizza;

public class PizzaTestDrive {
 
 public static void main(String[] args) {
  SimplePizzaFactory factory = new SimplePizzaFactory();
  PizzaStore store = new PizzaStore(factory);

  Pizza pizza = store.orderPizza("cheese");
  System.out.println("We ordered a " + pizza.getName() + "\n");
  System.out.println(pizza);
 
  pizza = store.orderPizza("pepperoni");
  System.out.println("We ordered a " + pizza.getName() + "\n");
  System.out.println(pizza);
 }
}
