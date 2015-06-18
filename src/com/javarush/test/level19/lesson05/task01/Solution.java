package com.javarush.test.level19.lesson05.task01;

/* Четные байты
Считать с консоли 2 имени файла.
Вывести во второй файл все байты с четным индексом.
Пример: второй байт, четвертый байт, шестой байт и т.д.
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        FileReader fileReader = new FileReader(reader.readLine());
        FileWriter fileWriter = new FileWriter(reader.readLine());
        while (fileReader.ready()) {
            int data = fileReader.read();
            list.add(data);
        }
        for (int i = 1; i < list.size(); i=i+2){
            fileWriter.write((char) (int) list.get(i));
        }
        fileReader.close();
        fileWriter.close();
        reader.close();
    }
}
