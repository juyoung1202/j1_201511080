package com.j2.wk7.Pizzaas;

public interface PizzaIngredientFactory {
 
 public Dough createDough();
 public Sauce createSauce();
 public Cheese createCheese();
 public Veggies[] createVeggies();
 public Pepperoni createPepperoni();
 public Clams createClam();
 
}