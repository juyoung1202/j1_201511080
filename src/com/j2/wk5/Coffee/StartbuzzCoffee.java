package com.j2.wk5.Coffee;

public class StartbuzzCoffee{
  public static void main(String args[]){
    Beverage dr = new DarkRost(); //Beverage b로 슈퍼클래스가 잡혀있기 때문에 업캐스팅
    
    Beverage m1 = new Mocha(dr);
    Beverage wmd1 = new Whip(m1); // new Whip(new Mocha(new DarkRost())):
    
    Beverage es = new Espresso(); //Beverage b로 슈퍼클래스가 잡혀있기 때문에 업캐스팅
    Beverage m2 = new Mocha(es);
    Beverage wmd2 = new Whip(m2);
    Beverage ca2 = new Caramelsyrup(wmd2); // new Whip(new Mocha(new DarkRost())):
    Under un = new Under();
    un.Under();
    System.out.println(wmd1.getDescription());
    System.out.println("cost:"+wmd1.cost());
    un.Under();
    System.out.println(ca2.getDescription());
    System.out.println("cost:"+ca2.cost());
    un.Under();
  }
}