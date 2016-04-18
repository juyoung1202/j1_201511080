package com.j2.wk7.Pizzaas;
public class VeggiePizza extends Pizza {
 PizzaIngredientFactory ingredientFactory;
 
 public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
  this.ingredientFactory = ingredientFactory;
 }
 
 void prepare() {
  System.out.println("Preparing " + name);
  dough = ingredientFactory.createDough();
  sauce = ingredientFactory.createSauce();
  cheese = ingredientFactory.createCheese();
  veggies = ingredientFactory.createVeggies();
 }
}