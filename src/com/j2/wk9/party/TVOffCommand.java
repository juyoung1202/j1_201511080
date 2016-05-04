package com.j2.wk9.party;
  
  public class TVOffCommand implements Command {
 TV tv;

 public TVOffCommand(TV tv) {
  this.tv= tv;
 }

 public void execute() {
  tv.off();
 }

 public void undo() {
  tv.on();
 }
}