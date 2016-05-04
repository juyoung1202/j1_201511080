package com.j2.wk9.undo;

public class LightOnCommand implements Command{
  Light light;
  int level;
 public LightOnCommand(Light light) {
  this.light = light;
 }
 public void undo(){
  light.dim(level); 
 }
 public void execute() {
  level = light.getLevel();
  light.on();
 }
}