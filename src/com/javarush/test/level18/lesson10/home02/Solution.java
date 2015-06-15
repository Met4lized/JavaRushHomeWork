package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран частоту встречания пробела. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
Закрыть потоки
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(args[0]);
        ArrayList<Character> dataFromFile = new ArrayList<>();
        int spaceCount = 0;
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            dataFromFile.add((char) data);
        }
        for (char pair : dataFromFile) {
            if (pair == ' ') {
                spaceCount++;
            }
        }
        double d = (double) spaceCount / dataFromFile.size() * 100;
        System.out.println(Math.rint(100.0 * d) / 100.0);
    }
}
