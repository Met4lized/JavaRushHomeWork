package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = new FileInputStream(args[1]);
        OutputStream outputStream = new FileOutputStream(args[2]);
        if (args[0].equals("-e")) {
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                outputStream.write(data - 5);
            }
        } else if (args[0].equals("-d")) {
            while (inputStream.available() > 0) {
                int data = inputStream.read();
                outputStream.write(data + 5);
            }
        }
    }
}
