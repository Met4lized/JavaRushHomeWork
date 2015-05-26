package com.javarush.test.level04.lesson13.task04;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем линии
Используя цикл for вывести на экран:
- горизонтальную линию из 10 восьмёрок
- вертикальную линию из 10 восьмёрок.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код
  /*      for (int j= 9; j>0; j--)
        {
            System.out.print("8");
        }

        for (int i = 10; i > 0; i--)
        {
            System.out.println("8");

        }
*/

        for(int j= 1; j<=10; j++){
            System.out.print("8");
        }
        System.out.println();
        System.out.println();
        for(int i = 0; i<=9; i++) {
            System.out.println("8");
        }

    }
}
