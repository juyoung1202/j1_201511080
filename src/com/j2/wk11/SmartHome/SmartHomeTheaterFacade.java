package com.j2.wk11.SmartHome;

public class SmartHomeTheaterFacade{
  private Book book;
  private Pen pen;
  private Light light;
  private Computer computer;
  public SmartHomeTheaterFacade(Book book, Pen pen, Light light, Computer computer) {
        this.book = book;
        this.pen = pen;
        this.light = light;
        this.computer = computer;
  }
  public void startlookbook(){
    System.out.println("ready to look the book");
    light.on();
    computer.on();
    computer.gameComputer("lol");
    pen.out();
    pen.refill();
    book.open();
  }
  public void stoplookbook(){
    System.out.println("stop study");
    light.off();
    computer.off();
    pen.out();
    book.close();
  }
  
  public void npa(){
   System.out.println(" Not paying attention");
    computer.gameComputer("Fifa");
  }
}