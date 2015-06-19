package com.javarush.test.level19.lesson10.home04;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();
    public static ArrayList<String> list = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader nameReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader filerReader = new BufferedReader(new FileReader(nameReader.readLine()));
        String line;
        {
            while ((line = filerReader.readLine()) != null) {
                String[] word = line.split(" ");
                for (String temp : word) {
                    if (words.contains(temp)) {
                        list.add(temp);
                    }
                }
                if (list.size() == 2) {
                    System.out.println(line);
                }
            }
        }
    }
}