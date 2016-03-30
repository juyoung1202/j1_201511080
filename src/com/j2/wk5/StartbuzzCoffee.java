package com.j2.wk5;

public class StartbuzzCoffee{
  public static void main(String args[]){
    Beverage b = new DarkRost(); //Beverage b로 슈퍼클래스가 잡혀있기 때문에 업캐스팅
    
    Beverage m = new Mocha(b);
    Beverage wmd = new Whip(m); // new Whip(new Mocha(new DarkRost())):
    System.out.println(wmd.getDescription());
    System.out.println(wmd.cost());
  }
}