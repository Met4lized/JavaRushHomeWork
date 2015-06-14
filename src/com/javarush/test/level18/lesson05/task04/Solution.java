package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        FileOutputStream outputStream = new FileOutputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());

        byte[] buffer = new byte[inputStream.available()];
        byte[] buffer2 = new byte[buffer.length];
        while (inputStream.available() > 0) {
            int count = inputStream.read(buffer);
            int i = buffer.length - 1;
            while (i >= 0) {
                for (int j = 0; j < buffer2.length; j++) {
                    buffer2[j] = buffer[i];
                    i--;
                }
            }
            outputStream.write(buffer2, 0 , count);
        }
    }
}