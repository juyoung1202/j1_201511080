package com.j2.wk11.Home;

public class HomeTheaterTestDrive{
  public static void main(String[] args){
   Amplifier amp = new Amplifier("My Amplifier");
   Tuner tuner = new Tuner("My AM/FM Tuner", amp);
   DvdPlayer dvd = new DvdPlayer("My DVD Player", amp);
   Projector projector = new Projector("My Projector", dvd);
   
   HomeTheaterFacade ht = new HomeTheaterFacade(amp,tuner,dvd,projector);
   ht.watchMovie("Watching movie");
   ht.endMovie();
  }
}