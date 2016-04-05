package com.j2.wk5.Coffee;

public abstract class Beverage{ //한파일에 하느라 public지움
  String description = "Unknown bever age";
  public String getDescription() {
    return description;
  }
  public abstract double cost();
}