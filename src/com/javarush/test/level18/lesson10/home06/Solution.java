package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки

Пример вывода:
, 19
- 7
f 361
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Character, Integer> charMap = new TreeMap<>();
        InputStream inputStream = new FileInputStream(args[0]);
        while (inputStream.available()>0){
            char ch = (char)inputStream.read();
            if (!charMap.containsKey(ch)){
                charMap.put(ch, 1);
            } else charMap.put(ch, charMap.get(ch).intValue() + 1);
        }
        inputStream.close();
        for (Map.Entry<Character, Integer> pair:charMap.entrySet()){
            System.out.println(pair.getKey()+" "+ pair.getValue());
        }
    }
}
