package com.javarush.test.level05.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(reader.readLine());
        int[] mas = new int[m];
        for (int i = 0; i < mas.length; i++)
        {
            int n = Integer.parseInt(reader.readLine());
            mas[i] = n;
        }
        Arrays.sort(mas);
        int maximum = mas[mas.length-1];
            //напишите здесь ваш код
            System.out.println(maximum);
        }
    }