package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать содержимое третьего файла
Закрыть потоки
Темповые файлы создавать нельзя, т.к. на сервере заблокирована возможность создания каких любо файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        OutputStream os = new FileOutputStream(reader.readLine(), true);
        InputStream is1 = new FileInputStream(reader.readLine());
        InputStream is2 = new FileInputStream(reader.readLine());
        reader.close();
        while (is1.available() > 0) {
            int data = is1.read();
            os.write(data);
        }
        is1.close();
        while (is2.available() > 0) {
            int data = is2.read();
            os.write(data);
        }
        os.close();
        is2.close();
    }
}
