package com.j2.wk5.Car;

public class Cartype{
  public static void main(String args[]){
    Beverage bmw = new Bmw(); 
    
    Beverage sunl1 = new Sunloof(bmw);
    Beverage goldt1= new Goldtire(sunl1); 
    
    Beverage audi = new Audi();
    Beverage sunl2 = new Sunloof(audi);
    Beverage diat2 = new Diatire(sunl2); 
    Under w = new Under();
    w.Under();
    System.out.println("1:car number:2");
    System.out.println(goldt1.getDescription());
    System.out.println("carcost:"+goldt1.cost()+"원");
    w.Under();
    System.out.println("2:car number:2");
    System.out.println(diat2.getDescription());
    System.out.println("carcost:"+diat2.cost()+"원");
  }
}