package com.javarush.test.level05.lesson07.task01;

/* Создать класс Friend
Создать класс Friend (друг) с тремя инициализаторами (тремя методами initialize):
- Имя
- Имя, возраст
- Имя, возраст, пол
*/

public class Friend
{
    //Напишите тут ваш код
    private String friendName;
    private int frienAge;
    private String frientSex;

    public void initialize(String name){
        this.friendName = name;
    }

    public void initialize(String name, int age){
        this.friendName = name;
        this.frienAge=age;
    }

    public void initialize(String name, int age, String sex){
        this.friendName = name;
        this.frienAge=age;
        this.frientSex = sex;
    }


}
