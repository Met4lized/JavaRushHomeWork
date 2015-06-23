package com.javarush.test.level21.lesson16.big01;

/**
 * Created by ausholohov on 23.06.2015.
 */
public class Horse {
    String name;
    double speed;
    double distance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void move() {
        distance += speed * Math.random();

    }

    public void print() {
        int i = (int) distance;
        for (int j = 0; j < i; j++) {
            System.out.print(".");
        }
        System.out.println(getName());
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;

    }
}
