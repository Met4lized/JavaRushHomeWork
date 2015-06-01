package com.javarush.test.level09.lesson11.home09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* Десять котов
Создать класс кот – Cat, с полем «имя» (String).
Создать словарь Map(<String, Cat>) и добавить туда 10 котов в виде «Имя»-«Кот».
Получить из Map множество(Set) всех имен и вывести его на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap()
    {
        //Напишите тут ваш код
        Map<String, Cat> map = new HashMap<>();
        map.put("Bursik", new Cat("Bursik"));
        map.put("Pushok", new Cat("Pushok"));
        map.put("Gigantus", new Cat("Gigantus"));
        map.put("Dread", new Cat("Dread"));
        map.put("Atos", new Cat("Atos"));
        map.put("Portos", new Cat("Portos"));
        map.put("Aramis", new Cat("Aramis"));
        map.put("DArtanyan", new Cat("DArtanyan"));
        map.put("Tom", new Cat("Tom"));
        map.put("Bonifaciy", new Cat("Bonya"));
        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map)
    {
        //Напишите тут ваш код
        Set<Cat> setCat = new HashSet<>();
        for (Map.Entry<String, Cat> pair : map.entrySet())
        {
            Cat value = pair.getValue();
            setCat.add(value);
        }
        return setCat;
    }

    public static void printCatSet(Set<Cat> set)
    {
        for (Cat cat:set)
        {
            System.out.println(cat);
        }
    }

    public static class Cat
    {
        private String name;

        public Cat(String name)
        {
            this.name = name;
        }

        public String toString()
        {
            return "Cat "+this.name;
        }
    }
}
