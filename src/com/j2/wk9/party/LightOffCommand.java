package com.j2.wk9.party;

public class LightOffCommand implements Command {
 Light light;
 int level;
 public LightOffCommand(Light light) {
  this.light = light;
  
 }
 public void undo(){
  light.dim(level); 
 }
 public void execute() {
   level = light.getLevel();
   light.off();
 }
}