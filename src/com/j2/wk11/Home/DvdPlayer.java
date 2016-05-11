package com.j2.wk11.Home;

public class DvdPlayer {
    String description;
    Light light;
    String study;
 
    public DvdPlayer(String description, Amplifier amplifier) {
        this.description = description;
        this.amplifier = amplifier;
    }
    public void on() {
        System.out.println(description + " on");
    }
    public void off() {
        System.out.println(description + " off");
    }
    public void eject() {
        movie = null;
        System.out.println(description + " eject");
    }
    public void play(String movie) {
        this.movie = movie;
        System.out.println(description + " playing \"" + movie + "\"");
    }
    public void stop() {
        System.out.println(description + " stopped \"" + movie + "\"");
    }
    public String toString() {
        return description;
    }
}