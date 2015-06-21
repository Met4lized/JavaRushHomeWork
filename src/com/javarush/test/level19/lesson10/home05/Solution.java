package com.javarush.test.level19.lesson10.home05;

/* Слова с цифрами
В метод main первым параметром приходит имя файла1, вторым - файла2.
Файл1 содержит слова, разделенные пробелом.
Записать через пробел в Файл2 все слова, которые содержат цифры, например, а1 или abc3d
Закрыть потоки
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(args[0]));
            FileWriter fileWriter = new FileWriter(args[1]);
            String data = "";
            while (reader.ready()) {
                data += reader.readLine();
            }
            String[] str = data.split(" ");
            for (String s : str) {
                if (s.matches(".*\\d.*")) {
                    fileWriter.write(s + " ");
                }
            }
            fileWriter.close();
            reader.close();
        } catch (IOException e) {
        }
    }
}
