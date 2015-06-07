package com.javarush.test.level14.lesson08.bonus03;

/**
 * Created by Anton on 07.06.2015.
 */

//читаем вики
public class Singleton
{
    private static Singleton instance;
    private Singleton ()
    {}

    public static Singleton getInstance()
    {
        if (instance == null)
        {
            instance = new Singleton();
        }
        return instance;
    }
}