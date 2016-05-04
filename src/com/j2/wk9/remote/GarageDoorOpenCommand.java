package com.j2.wk9.remote;

public class GarageDoorOpenCommand implements Command {
 GarageDoor garageDoor;

 public GarageDoorOpenCommand(GarageDoor garageDoor) {
  this.garageDoor = garageDoor;
 }

 public void execute() {
  garageDoor.up();
 }
 public void undo(){
 }
}