package com.j2.wk8.simple;

public class GarageDoorOpenCommand implements Command {
 GarageDoor garageDoor;

 public GarageDoorOpenCommand(GarageDoor garageDoor) {
  this.garageDoor = garageDoor;
 }

 public void execute() {
  garageDoor.up();
 }
}