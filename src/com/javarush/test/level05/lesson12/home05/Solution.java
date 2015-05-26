package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum=0;

        while (true)
        {
            String sN = reader.readLine();

            if (sN.equals("сумма"))
            {
                System.out.println(sum);
                break;

            }
            else
            {
                sum = sum + Integer.parseInt(sN);
            }

        }
    }
}
