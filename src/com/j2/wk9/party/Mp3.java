package com.j2.wk9.party;

public class Mp3 {
  String location;
  int listnum;
 
  public Mp3(String location) {
  this.location = location;
 }

 public void play() {
  System.out.println(location + " Mp3 is play");
 }

 public void stop() {
  System.out.println(location + " Mp3 is stop");
 }

 public void setInputList() {
  this.listnum = 3;
  System.out.println(location + " Music list is set for Cd");
 }
                            
}