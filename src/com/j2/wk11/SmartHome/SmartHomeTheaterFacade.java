package com.j2.wk11.SmartHome;

public class SmartHomeTheaterFacade {
    private Book book;
    private Pen pen;
    private Light light;
    private Computer computer;
 
    public SmartHomeTheaterFacade(Book book, Pen pen, Light light, Computer computer) {
        this.book = book;
        this.pen = pen;
        this.light = light;
        this.computer = computer;
    }
 
    public void lookBook(String book) {
        System.out.println("Get ready to look the book");
        projector.on();
        projector.wideScreenMode();
        amp.on();
        amp.setDvd(dvd);
        amp.setVolume(5);
        dvd.on();
        dvd.play(movie);
    }
    public void endMovie() {
        System.out.println("Shutting movie theater down...");
        projector.off();
        amp.off();
        dvd.stop();
        dvd.eject();
        dvd.off();
    }
    public void listenToRadio(double frequency) {
        System.out.println("Tuning in the airwaves...");
        tuner.on();
        tuner.setFrequency(frequency);
        amp.on();
        amp.setVolume(5);
        amp.setTuner(tuner);
    }
    public void endRadio() {
        System.out.println("Shutting down the tuner...");
        tuner.off();
        amp.off();
    }
}