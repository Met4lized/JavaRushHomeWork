package com.javarush.test.level22.lesson09.task03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

/* Составить цепочку слов
В методе main считайте с консоли имя файла, который содержит слова, разделенные пробелом.
В методе getLine используя StringBuilder расставить все слова в таком порядке,
чтобы последняя буква данного слова совпадала с первой буквой следующего не учитывая регистр.
Каждое слово должно участвовать 1 раз.
Метод getLine должен возвращать любой вариант.
Слова разделять пробелом.
В файле не обязательно будет много слов.

Пример тела входного файла:
Киев Нью-Йорк Амстердам Вена Мельбурн

Результат:
Амстердам Мельбурн Нью-Йорк Киев Вена
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName.readLine()));
        String data = "";
        while (fileReader.ready()) {
            data += fileReader.readLine() + " ";
        }
        String[] line = data.split(" ");

        //...
        StringBuilder result = getLine(line);
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, words);
        //Collections.shuffle(list);
        Collections.sort(list);
        StringBuilder s = new StringBuilder();
        s.append(list.get(0));
        list.remove(0);

        for (int i = 0; i < list.size(); i++) {
            String start = s.toString();
            if (start.endsWith(list.get(i).substring(0, 1))) {
                s.append(" ").append(list.get(i));
                list.remove(i);
            }
        }

        return s;
    }
}
