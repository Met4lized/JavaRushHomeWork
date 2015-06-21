package com.javarush.test.level19.lesson10.bonus03;

/* Знакомство с тегами
Считайте с консоли имя файла, который имеет HTML-формат
Пример:
Info about Leela <span xml:lang="en" lang="en"><b><span>Turanga Leela
</span></b></span>
Первым параметром в метод main приходит тег. Например, "span"
Вывести на консоль все теги, которые соответствуют заданному тегу
Каждый тег на новой строке, порядок должен соответствовать порядку следования в файле
Количество пробелов, \n, \r не влияют на результат
Файл не содержит тег CDATA, для всех открывающих тегов имеется отдельный закрывающий тег, одиночных тегов нету
Тег может содержать вложенные теги
Пример вывода:
<span xml:lang="en" lang="en"><b><span>Turanga Leela</span></b></span>
<span>Turanga Leela</span>

Шаблон тега:
<tag>text1</tag>
<tag text2>text1</tag>
<tag
text2>text1</tag>

text1, text2 могут быть пустыми
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String tag = args[0];
        String data = "";
        BufferedReader fileName = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName.readLine()));
        while (fileReader.ready()) {
            data += fileReader.readLine();
        }
        Stack<Integer> index = new Stack<>();
        Map<Integer, Integer> map = new TreeMap<>();

        for (int i = 0; i < data.length() - (tag.length() + 2); i++) {
            if (data.substring(i, i + 2 + tag.length()).equals("<" + tag + ">") ||
                    data.substring(i, i + 2 + tag.length()).equals("<" + tag + " ")) {
                index.push(i);
            }
            if (data.substring(i, i + 3 + tag.length()).equals("</" + tag + ">")) {
                if (!index.empty())
                    map.put(index.pop(), i);
            }
        }
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            System.out.println(data.substring(m.getKey(), m.getValue() + tag.length() + 3).replaceAll("\r\n", ""));
        }
    }
}

