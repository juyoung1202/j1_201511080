package com.j2.wk11.SmartHome;

public class Smart{
  public static void main(String[] args){
    Light light = new Light();
    Computer computer = new Computer();
    Book book = new Book();
    Pen pen = new Pen();
    SmartHomeTheaterFacade sf = new SmartHomeTheaterFacade(book, pen, light, computer);
    sf.startlookbook();
    System.out.println("-----studying...------");
    sf.stoplookbook();
    System.out.println("-----------");
    sf.npa();
  }
  
}