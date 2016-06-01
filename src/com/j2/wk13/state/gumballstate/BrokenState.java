package com.j2.wk13.state.gumballstate;
import java.util.Random;

public class BrokenState implements State {
    GumballMachine gumballMachine;
 
    public BrokenState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertQuarter() {
        System.out.println("You don't use GumballMachine ");
    }
 
    public void ejectQuarter() {
        System.out.println("You don't use GumballMachine ");
    }
 
    public void turnCrank() {
        System.out.println("You don't use GumballMachine ");
    }

    public void dispense() {
        System.out.println("You don't use GumballMachine ");
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
        return "waiting for turn of crank";
    }
}