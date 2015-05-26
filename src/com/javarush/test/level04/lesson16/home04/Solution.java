package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();

        String sY = reader.readLine();
        String sM = reader.readLine();
        String sD = reader.readLine();
        int y = Integer.parseInt(sY);
        int m = Integer.parseInt(sM);
        int d = Integer.parseInt(sD);

        System.out.println("Меня зовут "+name);
        System.out.println("Я родился " +d+"."+m+"."+y);



    }
}
