package com.javarush.test.level14.lesson08.home05;

/**
 * Created by Anton on 07.06.2015.
 */
public class Computer {
    private Keyboard Keyboard;
    private Mouse Mouse;
    private Monitor Monitor;

    public Keyboard getKeyboard() {
        return Keyboard;
    }

    public Mouse getMouse() {
        return Mouse;
    }

    public Monitor getMonitor() {
        return Monitor;
    }

    public Computer()
    {
        this.Keyboard = new Keyboard();
        this.Mouse = new Mouse();
        this.Monitor = new Monitor();
    }
}

