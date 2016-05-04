package com.j2.wk9.undo;

public interface Command{
  
  public void execute();
  public void undo();
}