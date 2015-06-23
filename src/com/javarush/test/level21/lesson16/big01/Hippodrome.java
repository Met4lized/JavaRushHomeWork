package com.javarush.test.level21.lesson16.big01;

import java.util.ArrayList;

/**
 * Created by ausholohov on 23.06.2015.
 */

public class Hippodrome {
    private ArrayList<Horse> horses = new ArrayList<>();
    public static Hippodrome game;

    public static void main(String[] args) throws InterruptedException {
        game = new Hippodrome();
        game.getHorses().add(new Horse("Sweet", 3, 0));
        game.getHorses().add(new Horse("Apple", 3, 0));
        game.getHorses().add(new Horse("Fasty", 3, 0));
        game.run();
        game.printWinner();

    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread.sleep(500);
            move();
            print();
        }
    }

    public void move() {
        for (Horse h : horses) {
            h.move();
        }
    }

    public void print() {
        for (Horse h : horses) {
            h.print();
            System.out.println();
            System.out.println();
        }
    }

    public Horse getWinner() {
        Horse winner = horses.get(0);
        for (Horse h : horses) {
            if (h.distance > winner.distance) {
                winner = h;
            }
        }
        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName()+"!");
    }

}