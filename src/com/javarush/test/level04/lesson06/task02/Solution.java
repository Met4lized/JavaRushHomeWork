package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sn1 = reader.readLine();
        String sn2 = reader.readLine();
        String sn3 = reader.readLine();
        String sn4 = reader.readLine();
        int n1 = Integer.parseInt(sn1);
        int n2 = Integer.parseInt(sn2);
        int n3 = Integer.parseInt(sn3);
        int n4 = Integer.parseInt(sn4);

        if ((n1 > n2) && (n1 > n3) && (n1 > n4))
            System.out.println(n1);
        else if ((n2 > n3) && (n2 > n4))
        {
            System.out.println(n2);
        } else if (n3 > n4)
        {
            System.out.println(n3);
        } else
        {
            System.out.println(n4);

        }
    }
}
