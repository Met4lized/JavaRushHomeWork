package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

//Ниже отвратительный код, который тем не менее работает. Не делайте так, и никому не рассказывайте что вы видели.

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Character> alphabet = new ArrayList<>();
        ArrayList<Character> dataFromFile = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < 26; i++) {
            alphabet.add((char) ('a' + i));
        }
        InputStream inputStream = new FileInputStream(args[0]);
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            dataFromFile.add((char) data);
        }
        inputStream.close();
        for (char pair : alphabet) {
            for (int i = 0; i < dataFromFile.size(); i++) {
                if (dataFromFile.get(i).equals(pair)) count++;
            }
        }
        System.out.println(count);
    }
}
