package com.javarush.test.level03.lesson12.level04.lesson06.task06;

/* И 18-ти достаточно
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();

        String sAge = reader.readLine();
        int iAge = Integer.parseInt(sAge);

        if (iAge > 20)
        {
            System.out.println("И 18-ти достаточно");
        }

    }
}
