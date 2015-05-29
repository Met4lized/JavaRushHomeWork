package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{

    public static void main(String[] args){


        System.out.println(getCountTheSameLastName(createMap(),"Baskov"));
        System.out.println(getCountTheSameFirstName(createMap(),"Petya"));

    }

    public static HashMap<String, String> createMap()
    {
        Map<String,String> map = new HashMap<String, String>();
        map.put("Ivanov","Petya");
        map.put("John","Konstantin");
        map.put("Babushkin","Ded");
        map.put("Baskov","Kolya");
        map.put("Kusai","Lomai");
        map.put("Familiya","Imechko");
        map.put("Skoka","Mojno");
        map.put("Nadoelo","Uje");
        map.put("Privet","Albert");
        map.put("Isnova","Petya");


        return (HashMap) map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name)
    {
        int count = 0;
        for (Map.Entry<String,String> pair: map.entrySet()){

            if (pair.getValue().equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        int count = 0;
        for (Map.Entry<String,String> pair: map.entrySet()){

            if (pair.getKey().equals(familiya)) {
                count++;
            }

        }
        return count;

    }
}
