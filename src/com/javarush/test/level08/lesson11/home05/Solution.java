package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        char a[] = s.toCharArray();
        //Напишите тут ваш код

        a[0] = Character.toUpperCase(a[0]);
        for (int i = 0; i < a.length; i++) {
            Character b = a[i];
            if (b.isSpaceChar(a[i])) {
                a[i + 1] = Character.toUpperCase(a[i + 1]);
            }
        }
        System.out.println(a);
    }
}
