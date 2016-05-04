package com.j2.wk9.party;
  
  public class Mp3PlayCommand implements Command {
 Mp3 mp3;

 public Mp3PlayCommand(Mp3 mp3) {
  this.mp3= mp3;
 }

 public void execute() {
  mp3.play();
 }

 public void undo() {
  mp3.stop();
 }
}