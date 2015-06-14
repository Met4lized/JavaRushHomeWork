package com.javarush.test.level18.lesson03.task03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* Самые частые байты
Ввести с консоли имя файла
Найти байты, которые чаше всех встречаются в файле
Вывести их на экран через пробел.
Закрыть поток ввода-вывода
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        List<Integer> list = new ArrayList<Integer>();
        int data;
        while (fileInputStream.available() > 0) {
            data = fileInputStream.read();
            map.put(data, 0);
            list.add(data);
        }
        fileInputStream.close();

        for (Map.Entry<Integer, Integer> pair1 : map.entrySet()) {
            for (Integer pair2 : list) {
                if (pair1.getKey().equals(pair2)) pair1.setValue(pair1.getValue() + 1);
            }
        }

        list.clear();
        list.addAll(map.values());
        Collections.sort(list);

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            if (pair.getValue().equals(list.get(list.size() - 1)))
                System.out.print(pair.getKey() + " ");
        }
    }
}
