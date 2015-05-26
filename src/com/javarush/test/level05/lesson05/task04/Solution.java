package com.javarush.test.level05.lesson05.task04;

/* Создать три объекта типа Cat
В методе main создать три объекта типа Cat и заполнить их данными.
Использовать класс Cat из первой задачи. Класс Cat создавать не надо.
*/

public class Solution {
    public static void main(String[] args) {
        Cat vaska = new Cat("Vaska", 8, 5, 4);
        Cat pushok = new Cat("Pushok", 6, 4, 4);
        Cat gigantus = new Cat("Gigantus", 5, 10, 8);
        //add your code here
    }

    public static class Cat {

        public static int count = 0;
        private String name;
        private int age;
        private int weight;
        private int strength;


        public Cat(String name, int age, int weight, int strength) {
            count++;

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }



    }
}
