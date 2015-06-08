package com.javarush.test.level15.lesson12.home01;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Разные методы для разных типов
1. Считать с консоли данные, пока не введено слово "exit".
2. Для каждого значения вызвать метод print. Если значение:
2.1. содержит точку '.', то вызвать метод print для Double;
2.2. больше нуля, но меньше 128, то вызвать метод print для short;
2.3. больше либо равно 128, то вызвать метод print для Integer;
2.4. иначе, вызвать метод print для String.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String data = reader.readLine();

            try {
                if (data.equals("exit")) {
                    break;
                } else {
                    if (data.contains(".")) {
                        double d = Double.parseDouble(data);
                        print(d);
                    } else if (Integer.parseInt(data) >= 128) {  //проверка на Integer стояла ниже проверки на Short, поэтому я сдал эту задачу с 12ой попытки.
                        int in = Integer.parseInt(data);          //если кто-нибудь знает разницу, позвоните мне :)
                        print(in);
                    } else if (Short.parseShort(data) > 0 & Short.parseShort(data) < 128) {
                        short sh = Short.parseShort(data);
                        print(sh);
                    } else print(data);
                }
            } catch (NumberFormatException e) {
                print(data);
            }
        }
        reader.close();
    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
