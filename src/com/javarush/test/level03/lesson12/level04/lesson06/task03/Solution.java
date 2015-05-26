package com.javarush.test.level03.lesson12.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sN1 = reader.readLine();
        int n1 = Integer.parseInt(sN1);

        String sN2 = reader.readLine();
        int n2 = Integer.parseInt(sN2);

        String sN3 = reader.readLine();
        int n3 = Integer.parseInt(sN3);

        if (n1<n2 && n2<n3)
            System.out.println(n3+" "+n2+" "+n1);
        else if (n2<n1 && n1<n3)
            System.out.println(n3+" "+n1+" "+n2);
        else if (n3<n1 && n1<n2)
            System.out.println(n2+" "+n1+" "+n3);
        else if (n3<n2 && n2<n1)
            System.out.println(n1+" "+n2+" "+n3);
        else if (n1<n3 && n3<n2)
            System.out.println(n2+" "+n3+" "+n1);
        else System.out.println(n1+" "+n3+" "+n2);

    }
}
