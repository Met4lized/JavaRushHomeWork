package com.javarush.test.level07.lesson09.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Удвой слова
1. Введи с клавиатуры 10 слов в список строк.
2. Метод doubleValues должен удваивать слова по принципу a,b,c -> a,a,b,b,c,c.
3. Используя цикл for выведи результат на экран, каждое значение с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        //read strings and init ArrayList list here - считать строки с консоли и объявить ArrayList list тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++)
        {
            String s = reader.readLine();
            list.add(s);
        }

        ArrayList<String> result = doubleValues(list);
        for (int i = 0; i < 2 * list.size(); i++)
            System.out.println(result.get(i));
        //print result - вывести на экран result
    }
    public static ArrayList<String> doubleValues(ArrayList<String> list)
    {
        // add your code here - добавь код тут
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++)
        {
            String x = list.get(i);
            list1.add(x);
            list1.add(x);
        }
        return list1;
    }
}
