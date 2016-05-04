package com.j2.wk8.simple;

public class LightOnCommand implements Command{
  Light light;
  
 public LightOnCommand(Light light) {
  this.light = light;
 }
 
 public void execute() {
  light.on();
 }
}