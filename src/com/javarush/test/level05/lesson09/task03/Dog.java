package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    //Напишите тут ваш код
    private String dName;
    private int dHeight;
    private String dColor;

    public Dog(String name){
        this.dName=name;
    }

    public Dog(String name, int height){
        this.dName=name;
        this.dHeight=height;
    }
    public Dog(String name, int height, String color){
        this.dName=name;
        this.dHeight=height;
        this.dColor=color;
    }


}
