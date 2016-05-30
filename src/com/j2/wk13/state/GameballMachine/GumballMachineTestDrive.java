package com.j2.wk13.state.GameballMachine;


public class GumballMachineTestDrive {
    public static void main(String[] args) {
     GumballMachine gumballMachine = new GumballMachine(5);

     System.out.println(gumballMachine);

     gumballMachine.insertQuarter();
     gumballMachine.turnCrank();

     System.out.println(gumballMachine);

     gumballMachine.insertQuarter();
     gumballMachine.ejectQuarter();
     gumballMachine.turnCrank();

     System.out.println(gumballMachine);

     gumballMachine.insertQuarter();
     gumballMachine.turnCrank();
     gumballMachine.insertQuarter();
     gumballMachine.turnCrank();
     gumballMachine.ejectQuarter();

     System.out.println(gumballMachine);

     gumballMachine.insertQuarter();
     gumballMachine.insertQuarter();
     gumballMachine.turnCrank();
     gumballMachine.insertQuarter();
     gumballMachine.turnCrank();
     gumballMachine.insertQuarter();
     gumballMachine.turnCrank();

     System.out.println(gumballMachine);
    }
}