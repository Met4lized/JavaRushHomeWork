package com.javarush.test.level19.lesson10.home03;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* Хуан Хуанович
В метод main первым параметром приходит имя файла.
В этом файле каждая строка имеет следующий вид:
имя день месяц год
где [имя] - может состоять из нескольких слов, разделенных пробелами, и имеет тип String
[день] - int, [месяц] - int, [год] - int
данные разделены пробелами

Заполнить список PEOPLE импользуя данные из файла
Закрыть потоки

Пример входного файла:
Иванов Иван Иванович 31 12 1987
Вася 15 5 2013
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) {
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(args[0]));
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            while (fileReader.ready()) {
                String data = fileReader.readLine();
                String parseChars = data.replaceAll("[^\\W\\s]", "");
                String name = parseChars.substring(0, parseChars.length() - 3);
                String birthday = data.replaceAll("[^\\d\\s]", "");
                Date date = (dateFormat.parse(birthday)); //сам отсекает лишние пробелы :)
                PEOPLE.add(new Person(name, date));
            }
            for (Person pair : PEOPLE) {
                System.out.println(pair.getName() + " " + pair.getBirthday());
            }
        } catch (Exception e) {
        }
    }
}