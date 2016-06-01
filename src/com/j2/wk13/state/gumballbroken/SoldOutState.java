package com.j2.wk13.state.gumballbroken;

public class SoldOutState implements State {
    GumballMachine gumballMachine;
 
    public SoldOutState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
 public void insertQuarter() {
  System.out.println("You can't insert a quarter, the machine is sold out");
 }
 
 public void ejectQuarter() {
  System.out.println("You can't eject, you haven't inserted a quarter yet");
 }
 
 public void turnCrank() {
  System.out.println("You turned, but there are no gumballs");
 }
 
 public void dispense() {
  System.out.println("No gumball dispensed");
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
  return "sold out";
 }
}