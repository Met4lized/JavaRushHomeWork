package com.javarush.test.level05.lesson09.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя конструкторами:
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код

   private String fName;
   private int fAge;
   private String fSex;

    public Friend(String name){
        this.fName=name;
    }

    public Friend(String name, int age){
        this.fName=name;
        this.fAge=age;
    }

    public Friend(String name, int age, String sex){
        this.fName=name;
        this.fAge=age;
        this.fSex=sex;
    }
}