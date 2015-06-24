package com.javarush.test.level22.lesson09.task03;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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
    public static void main(String[] args) {
        try (BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(fileName.readLine()))) {
            String data = "";
            while (fileReader.ready()) {
                data += fileReader.readLine() + " ";
            }
            String[] line = data.split(" ");
            //...
            StringBuilder result = getLine(line);
            System.out.println(result.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static StringBuilder getLine(String... words) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> listSopy = new ArrayList<>();
        Set<String> set = new HashSet<>();
        Collections.addAll(list, words);
        listSopy.addAll(list);

        StringBuilder s = new StringBuilder();

        while (list.size() != 0) {
            Collections.shuffle(list);
            String sValue = s.toString();
            if (sValue.equals("")) {
                s.append(list.get(0));
                set.add(list.get(0));
                list.remove(0);
            }

            for (int i = 0; i < list.size(); i++) {
                String start = s.toString().toLowerCase();
                String tmp = list.get(i).toLowerCase();
                if (start.endsWith(tmp.substring(0, 1))) {
                    s.append(" ").append(list.get(i));
                    set.add(list.get(i));
                    list.remove(i);
                }
            }
            if (s.toString().split(" ").length != listSopy.size()) {
                list.addAll(listSopy);
                s.delete(0, s.length());
                set.clear();
            } else if (set.size() < listSopy.size()) {
                list.addAll(listSopy);
                s.delete(0, s.length());
                set.clear();
            } else break;
        }

        return s;
    }
}
