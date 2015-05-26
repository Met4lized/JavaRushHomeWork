package com.javarush.test.level04.lesson13.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Рисуем прямоугольник
Ввести с клавиатуры два числа m и n.
Используя цикл for вывести на экран прямоугольник размером m на n из восьмёрок.
Пример: m=2, n=4
8888
8888
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //Напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sM= reader.readLine();
        String sN= reader.readLine();
        int m = Integer.parseInt(sM);
        int n = Integer.parseInt(sN);

for (int i1 = 0; i1 < m; i1++){
            for (int i2 = 0; i2 < n; i2++){
                System.out.print(8);
            }
            System.out.println("");
        }

    }
}
