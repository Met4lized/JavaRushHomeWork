package com.javarush.test.level05.lesson07.task04;

/* Создать класс Circle
Создать класс (Circle) круг, с тремя инициализаторами:
- centerX, centerY, radius
- centerX, centerY, radius, width
- centerX, centerY, radius, width, color
*/

public class Circle
{
    //Напишите тут ваш код
    private int cCenterX;
    private int cCentery;
    private int cRadius;
    private int cWidth;
    private String cColor;


    public void initialize(int centerX, int centery, int radius)
    {
        this.cCenterX = centerX;
        this.cCentery = centery;
        this.cRadius = radius;
    }

    public void initialize(int centerX, int centery, int radius, int width)
    {
        this.cCenterX = centerX;
        this.cCentery = centery;
        this.cRadius = radius;
        this.cWidth = width;
    }

    public void initialize(int centerX, int centery, int radius, int width, String color)
    {
        this.cCenterX = centerX;
        this.cCentery = centery;
        this.cRadius = radius;
        this.cWidth = width;
        this.cColor = color;

    }
}