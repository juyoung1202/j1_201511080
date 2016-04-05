package com.j2.wk5.Coffee;


public class Whip extends CondimentDecorator {
  
  Beverage beverage;
  public Whip(Beverage b) {//슈퍼클래스로 잡아놈//슈퍼클래스로 잡아놈
    beverage=b;
  }
  public String getDescription() {
    return beverage.getDescription() + ", Whip";
  }
  public double cost() {
    return beverage.cost() + .10;
  }
}
