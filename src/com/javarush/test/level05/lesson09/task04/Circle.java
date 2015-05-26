package com.javarush.test.level05.lesson09.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя конструкторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    private int cCenterX;
    private int cCentery;
    private int cRadius;
    private int cWidth;
    private String cColor;


    //Напишите тут ваш код
    public Circle(int centerX, int centery, int radius)
    {
        this.cCenterX = centerX;
        this.cCentery = centery;
        this.cRadius = radius;
    }

    public Circle(int centerX, int centery, int radius, int width)
    {
        this.cCenterX = centerX;
        this.cCentery = centery;
        this.cRadius = radius;
        this.cWidth = width;
    }

    public Circle(int centerX, int centery, int radius, int width, String color)
    {
        this.cCenterX = centerX;
        this.cCentery = centery;
        this.cRadius = radius;
        this.cWidth = width;
        this.cColor = color;

    }
}
