package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //Напишите тут ваш код
        Map<String, String> map = new HashMap<>();
        map.put("Петров", "Петр");
        map.put("Федоров", "Петр");
        map.put("Казанов", "Петр");
        map.put("Дабуди", "Дабудай");
        map.put("Дабл", "Демедж");
        map.put("Гильермо", "Дельторо");
        map.put("Как", "Дела");
        map.put("Лучше", "Бы");
        map.put("Цикл", "Написал");
        map.put("Чем", "Мучаться");
        return (HashMap) map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        HashMap<String, String> del = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            del.remove(pair.getKey());
            if (del.containsValue(pair.getValue()))
                removeItemFromMapByValue(map, pair.getValue());
        }
    }


    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> wasBorn = createMap();
        // removeItemFromMapByValue(wasBorn, "Петр");
        removeTheFirstNameDuplicates(wasBorn);
        System.out.println(wasBorn);
    }
}
