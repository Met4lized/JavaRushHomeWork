package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.*;
import java.util.*;

public class Solution {
    private static List<String> list = new ArrayList<>();
    private static int id = 0;

    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        Formatter formatter = new Formatter();
        String price = null;
        String quantity = null;
        if (args[0].equals("-c") & args.length > 3) {
            String fileName = new Scanner(System.in).nextLine();
            FileWriter writer = new FileWriter(fileName, true);
            fillMap(list, fileName);
            for (String arg : args) {
                if (arg.equals("-c")) {
                    continue;
                } else if (arg.matches("[-+]?\\d+") & args[args.length - 1].equals(arg)) {
                    quantity = arg;
                    continue;
                } else if (arg.matches("((-|\\+)?[0-9]+(\\.[0-9]+)?)+") & args[args.length - 2].equals(arg)) {
                    price = arg;
                    continue;
                } else {
                    sb.append(arg).append(" ");
                }
            }
            String productName = sb.toString();
            writer.write(formatter.format("\n%-8.8s%-30.30s%-8.8s%-4.4s", ++id, productName, price, quantity).toString());
            writer.flush();
            writer.close();
            formatter.close();
        }
    }

    public static List<String> fillMap(List<String> list, String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null | reader.ready()) {
                try {
                    if (id < Integer.parseInt(line.substring(0, 8).trim())) {
                        id = Integer.parseInt(line.substring(0, 8).trim());
                    }
                } catch (Exception e) {
                    continue;
                }
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}