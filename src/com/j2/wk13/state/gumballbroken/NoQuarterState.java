package com.j2.wk13.state.gumballbroken;

public class NoQuarterState implements State {
    GumballMachine gumballMachine;
 
    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
 public void insertQuarter() {
  System.out.println("You inserted a quarter");
  gumballMachine.setState(gumballMachine.getHasQuarterState());
 }
 
 public void ejectQuarter() {
  System.out.println("You haven't inserted a quarter");
 }
 
 public void turnCrank() {
  System.out.println("You turned, but there's no quarter");
  }
 
 public void dispense() {
  System.out.println("You need to pay first");
 } 
 public void StrangeQuarter() {
        gumballMachine.setState(gumballMachine.getBrokenState());
        System.out.println("Broken GumballMachine");
    }
    public void Fix() {
        gumballMachine.setState(gumballMachine.getFixState());
        System.out.println("Fix GumballMachine");
    }
 public String toString() {
  return "waiting for quarter";
 }
}