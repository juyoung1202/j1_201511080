package com.j2.wk5.Car;

class Diatire extends CondimentDecorator{
 Beverage beverage; // 값이 들어오는건 new Mocha()생성자가 실행될 때
 public Diatire(Beverage b) { //내 안의 너 있다 패턴 중요
   
   beverage = b;
 }
 public String getDescription() {
  return beverage.getDescription()+", - DiamondTire"; 
 }
 public double cost() {
  return beverage.cost() + .120; 
 }
}