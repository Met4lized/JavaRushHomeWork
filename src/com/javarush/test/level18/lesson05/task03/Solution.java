package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки ввода-вывода
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        FileInputStream inputStream = new FileInputStream(reader.readLine());
        FileOutputStream outputStream1 = new FileOutputStream(reader.readLine());
        FileOutputStream outputStream2 = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[inputStream.available()];
        int count = inputStream.read(buffer);
        int f1 = 0;
        int f2 = 0;
        if (count > 0) {
            if ((count & 1) == 0) {
                f1 = count / 2;
                f2 = f1;
            } else {
                f1 = (count / 2) + 1;
                f2 = count - f1;
            }
        }
        outputStream1.write(buffer, 0, f1);
        outputStream2.write(buffer, f1, f2);

        reader.close();
        inputStream.close();
        outputStream1.close();
        outputStream2.close();
    }
}
