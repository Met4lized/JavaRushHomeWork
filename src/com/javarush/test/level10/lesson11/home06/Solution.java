package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

import java.util.HashMap;

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human {
        //напишите тут ваши переменные и конструкторы
        String name;
        int age;
        boolean sex;
        String adress;
        String work;
        boolean driveCard;

        public Human(String name){
            this.name=name;
        }

        public Human(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Human(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, boolean driveCard){
            this.name = name;
            this.driveCard = driveCard;
        }

        public Human(String name, String adress){
            this.name=name;
            this.adress=adress;
        }

        public Human(String name, boolean sex, boolean driveCard){
            this.name=name;
            this.driveCard=driveCard;
            this.sex=sex;

        }
        public Human(String name, String adress, boolean sex){
            this.name=name;
            this.adress=adress;
            this.sex=sex;
        }
        public Human(String adress, boolean driveCard, int age){
            this.adress=adress;
            this.age=age;
            this.driveCard=driveCard;
        }
        public Human(String work, boolean sex, String name){
            this.name=name;
            this.sex= sex;
            this.work=work;
        }
        public Human(String name, int age, String work){
            this.name=name;
            this.age=age;
            this.work=work;
        }

    }
}
