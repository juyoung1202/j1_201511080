package com.j2.wk6.Pizzam;

public class NYPizzaStore extends PizzaStore {

 Pizza createPizza(String item) {
  if (item.equals("cheese")) {
   return new NYStyleCheesePizza();
  }  else return null;
 }
}