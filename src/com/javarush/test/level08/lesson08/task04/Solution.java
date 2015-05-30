package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static void main(String[] args) {

        removeAllSummerPeople(createMap());
       // System.out.println(createMap());
    }

    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 1 1980"));
        map.put("Карлеоне", new Date("JULY 3 1971"));
        map.put("Патифоне", new Date("AUGUST 8 1999"));
        map.put("Сифоне", new Date("MARCH 8 1999"));
        map.put("Расскажук", new Date("SEPTEMBER 8 1999"));
        map.put("Вам", new Date("MAY 8 1999"));
        map.put("Сказочкин", new Date("NOVEMBER 8 1999"));
        map.put("Про", new Date("DECEMBER 8 1999"));
        map.put("Серов", new Date("OCTOBER 7 1999"));
        map.put("Бычков", new Date("DECEMBER 1 2001"));

        //Напишите тут ваш код
        return map;

    }


    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //Напишите тут ваш код
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Date> pair = iterator.next();
            Date value = pair.getValue();
            int d = value.getMonth();
            if (d >= 5 && d <= 7) {
                iterator.remove();
            }


        }
    }
}
