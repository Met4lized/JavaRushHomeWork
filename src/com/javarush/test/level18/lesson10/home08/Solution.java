package com.javarush.test.level18.lesson10.home08;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Не забудьте закрыть все потоки
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> names = new ArrayList<>();
        String fileName;
        while (!(fileName = reader.readLine()).equals("exit")) {
            names.add(fileName);
        }
        for (String pair : names) {
            new ReadThread(pair).start();
        }
    }
    public static class ReadThread extends Thread {
        private String fileName;

        public ReadThread(String fileName) {
            this.fileName = fileName;
            //implement constructor body
        }
        // implement file reading here - реализуйте чтение из файла тут

        @Override
        public void run() {
            try {
                InputStream stream = new FileInputStream(fileName);
                Map<Integer, Integer> map = new TreeMap<>();
                while (stream.available() > 0) {
                    int i = stream.read();
                    if (!map.containsKey(i)) {
                        map.put(i, 1);
                    } else map.put(i, map.get(i).intValue() + 1);
                }
                int count = 0;
                int b;
                for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
                    if (pair.getValue() > count) {
                        count = pair.getValue();
                        b = pair.getKey();
                        resultMap.put(fileName, b);
                    }
                }
                System.out.println(resultMap);

            } catch (IOException e) {
            }

        }
    }
}
