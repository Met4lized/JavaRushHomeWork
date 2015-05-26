package com.javarush.test.level05.lesson07.task02;

/* Создать класс Cat
Создать класс Cat (кот) с пятью инициализаторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст неизвестны, это бездомный кот)
- вес, цвет, адрес ( чужой домашний кот)
Задача инициализатора – сделать объект валидным. Например, если вес неизвестен, то нужно указать какой-нибудь средний вес. Кот не может ничего не весить. То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

public class Cat
{
    //Напишите тут ваш код
    private String catName = null;
    private int catWeight=3;
    private int catAge = 1;
    private String catColor = null;
    private String catAdress = null;


    public void initialize (String name){
        this.catName="Pushok";
    }

    public void initialize (String name, int weight, int age){
        this.catName="Bursik";
        this.catWeight=5;
        this.catAge=5;

    }
    public void initialize (String name, int age ){
        this.catName="Cesar";
        this.catAge=9;

    }
    public void initialize (int weight, String color){
        this.catWeight = 3;
        this.catColor="Gray";

    }
    public void initialize (int age, String color, String adress){
        this.catWeight=8;
        this.catColor="Black";
        this.catAdress="Dom";
    }

}
