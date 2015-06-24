package com.javarush.test.level22.lesson05.task02;

/* Между табуляциями
Метод getPartOfString должен возвращать подстроку между первой и второй табуляцией.
На некорректные данные бросить исключение TooShortStringException.
Класс TooShortStringException не менять.
*/
public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        try {
            int tabFirst = string.indexOf("\t");
            int tabSecond = string.indexOf("\t", tabFirst + 1);

            return string.substring(tabFirst + 1, tabSecond);
        } catch (Exception e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }
}
