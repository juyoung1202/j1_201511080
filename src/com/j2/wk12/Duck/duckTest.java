package com.j2.wk12.Duck;

import java.util.Arrays;

public class duckTest{
  public static void main(String[] args){
  
    Duck[] ducks = {new Duck("juyoung",8),new Duck("hong",3),new Duck("gil",6),new Duck("dong",5)};
    
    System.out.println("Before sorting:");
    display(ducks);
    Arrays.sort(ducks); //version 0
    System.out.println("\nAtfer sorting:");
    display(ducks);
    
    Duck[] myDucks = {new Duck("Sang", 8), new Duck("Myung", 2), new Duck("Uni", 7)}; 
    Arrays.sort(myDucks, new DuckComparator()); //version1
    System.out.println("\nAfter sorting:");
    display(myDucks);
    
  }
  public static void display(Duck[] ducks){
    for(int i = 0; i < ducks.length; i++){
     System.out.println(ducks[i]); 
    }
  }
}