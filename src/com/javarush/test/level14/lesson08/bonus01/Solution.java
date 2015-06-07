package com.javarush.test.level14.lesson08.bonus01;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* Нашествие эксепшенов
Заполни массив exceptions 10 различными эксепшенами.
Первое исключение уже реализовано в методе initExceptions.
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            ArrayList list = new ArrayList();
            for (int i = 0; i < list.size() + 1; i++) {
                list.get(i);
            }
        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            InputStream inStream = new FileInputStream("c:/source.txt ");

        } catch (Exception e) {
            exceptions.add(e);
        }

        Object szStr[] = new String[10];

        try {
            szStr[0] = new Character('*');
        } catch (Exception e) {
            exceptions.add(e);
        }

        Object ch = new Character('*');

        try {
            System.out.println((Byte) ch);
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int[] nNegArray = new int[-5];
        } catch (Exception e) {
            exceptions.add(e);
        }

        String szShortString = "123";
        try {
            char chr = szShortString.charAt(10);
        } catch (Exception e) {
            exceptions.add(e);
        }
        int[] nNulArray = new int[5];
        nNulArray = null;
        try {
            int i = nNulArray.length;
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            int i = Integer.parseInt("text");
        } catch (Exception e) {
            exceptions.add(e);
        }
        try {
            throw new InterruptedException();
        } catch (InterruptedException e) {
            exceptions.add(e);
        }

    }
}
