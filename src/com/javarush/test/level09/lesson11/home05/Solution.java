package com.javarush.test.level09.lesson11.home05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* Гласные и согласные буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа должна вывести на экран две строки:
1. первая строка содержит только гласные буквы
2. вторая - только согласные буквы и знаки препинания из введённой строки.
Буквы соединять пробелом.

Пример ввода:
Мама мыла раму.
Пример вывода:
а а ы а а у
М м м л р м .
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //Написать тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = reader.readLine().toCharArray();
        ArrayList<Character> charsSogl = new ArrayList<>();
        ArrayList<Character> charsGlas = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            if (isVowel(chars[i])) {
                charsGlas.add(chars[i]);

            } else charsSogl.add(chars[i]);
        }
        Iterator<Character> iterator = charsSogl.iterator();
        while (iterator.hasNext()) {

            Character b = iterator.next();
            if (b == ' ') {
                iterator.remove();
            }
        }

        for (char i : charsGlas) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (char i : charsSogl) {
            System.out.print(i + " ");
        }
    }

    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    //метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  //приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   //ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}
