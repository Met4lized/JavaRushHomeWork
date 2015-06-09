package com.javarush.test.level15.lesson12.bonus01;

/**
 * Created by ausholohov on 09.06.2015.
 */
public class Plane implements Flyable {
    int pas;

    @Override
    public void fly() {

    }

    public Plane(int n) {
        this.pas = n;
    }
}
