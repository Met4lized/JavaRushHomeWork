package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            FileWriter fileWriter = new FileWriter(args[1]);
            String data = "";
            String temp = "";
            while (fileReader.ready()) {
                data += fileReader.readLine() + " ";
            }
            fileReader.close();
            String[] lineData = data.split(" ");
            for (int i = 0; i < lineData.length; i++) {
                char[] wordsChars = lineData[i].toCharArray();
                if (wordsChars.length > 6) {
                    temp += (String.valueOf(wordsChars)) + ",";
                }
            }
            fileWriter.write(temp.substring(0, temp.length() - 1));
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}