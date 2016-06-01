package com.j2.wk13.state.gumballbroken;
import java.util.Random;

public class Fix implements State {
    GumballMachine gumballMachine;
 
    public Fix(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
  
    public void insertQuarter() { //여기서 dispanse까지 구현할 필요가 없음 애초에 getFix에 sold로 주었음
        System.out.println("You don't use GumballMachine ");
    }
 
    public void ejectQuarter() {
        System.out.println("You don't use GumballMachine ");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }
 
    public void turnCrank() {
        System.out.println("You don't use GumballMachine ");
        gumballMachine.setState(gumballMachine.getSoldState());
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