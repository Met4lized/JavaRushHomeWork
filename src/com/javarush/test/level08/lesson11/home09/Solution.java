package com.javarush.test.level08.lesson11.home09;

import java.util.Date;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) {

        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {

        Date yearsStartTime = new Date();
        yearsStartTime.setHours(0);
        yearsStartTime.setMinutes(0);
        yearsStartTime.setSeconds(0);

        yearsStartTime.setDate(1);
        yearsStartTime.setMonth(0);

        Date currentTIme = new Date();
        long msTimeDistance = currentTIme.getTime() - yearsStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;
        int dayCount = (int) (msTimeDistance / msDay);

        if (dayCount % 2 == 0) {
            return false;
        } else return true;
    }
}



