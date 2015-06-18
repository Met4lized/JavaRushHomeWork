package com.javarush.test.level19.lesson05.task03;

/* Выделяем числа
Считать с консоли 2 имени файла.
Вывести во второй файл все числа, которые есть в первом файле.
Числа выводить через пробел.
Закрыть потоки ввода-вывода.

Пример тела файла:
12 text var2 14 8v 1

Результат:
12 14 1
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        reader.close();
        ArrayList<Integer> numList = new ArrayList<>();
        String s = "";
        while (fileReader.ready()) {
            s += (char) fileReader.read();
        }
        fileReader.close();
        String[] lines = s.split(" ");
        for (String pair : lines) {
            try {
                int i = Integer.parseInt(pair);
                numList.add(i);
            } catch (Exception e) {
            }
        }
        for (int pair : numList) {
            fileWriter.write(pair + " ");
        }
        fileWriter.close();
    }
}
