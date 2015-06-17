package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть все потоки ввода-вывода
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, byte[]> map = new TreeMap<>();
        String fileName;
        StringBuilder s = new StringBuilder();
        while (!(fileName = reader.readLine()).equals("end")) {
            s.append(fileName);
            s.delete(fileName.indexOf(".part"), s.length());
            String parts = fileName.substring(fileName.lastIndexOf("part", fileName.length()));
            InputStream is = new FileInputStream(fileName);
            byte[] buffer = new byte[is.available()];
            is.read(buffer);
            map.put(parts, buffer);
            is.close();
        }
        reader.close();
        OutputStream os = new FileOutputStream(String.valueOf(s));
        for (Map.Entry<String, byte[]> pair : map.entrySet()) {
            byte[] data = pair.getValue();
            os.write(data);
        }
        os.close();
    }
}


