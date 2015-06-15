package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        InputStream file1 = new FileInputStream(fileName1);
        InputStream file2 = new FileInputStream(fileName2);
        byte[] bufferFile1 = new byte[file1.available()];
        byte[] bufferFile2 = new byte[file2.available()];
        file1.read(bufferFile1);
        file2.read(bufferFile2);

        OutputStream outputStream = new FileOutputStream(fileName1);
        outputStream.write(bufferFile2);
        outputStream.write(bufferFile1);
    }
}
