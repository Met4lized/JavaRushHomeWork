package com.javarush.test.level19.lesson08.task04;

/* Решаем пример
В методе main подмените объект System.out написанной вами ридер-оберткой по аналогии с лекцией
Ваша ридер-обертка должна выводить на консоль решенный пример
Вызовите готовый метод printSomething(), воспользуйтесь testString
Верните переменной System.out первоначальный поток

Возможные операции: + - *
Шаблон входных данных и вывода: a [знак] b = c
Отрицательных и дробных чисел, унарных операторов - нет.

Пример вывода:
3 + 6 = 9
*/

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();

        System.setOut(consoleStream);
        String preResult = outputStream.toString();
        String num = preResult.replaceAll("[^\\d\\s\\+\\-\\*]", "");
        String[] s = num.split(" ");
        int num1 = Integer.parseInt(s[0]);
        String action = s[1];
        int num2 = Integer.parseInt(s[2]);
        int result = 0;

        if (action.equals("+")) {
            result = num1 + num2;
        } else if (action.equals("-")) {
            result = num1 - num2;
        } else if (action.equals("*")) {
            result = num1 * num2;
        }

        System.out.println(num1 + " " + action + " " + num2 + " = " + result);
        outputStream.close();
        stream.close();
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

