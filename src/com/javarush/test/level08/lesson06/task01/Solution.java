package com.javarush.test.level08.lesson06.task01;

import java.util.*;

/* Создать два списка LinkedList и ArrayList
Нужно создать два списка – LinkedList и ArrayList.
*/

public class Solution
{
    public static Object createArrayList()
    {
        //Напишите тут ваш код
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Куку");
        arrayList.add("Ромашки");
        arrayList.add("Привет");
        arrayList.add("Пока");
        return arrayList;
    }

    public static Object createLinkedList()
    {
        //Напишите тут ваш код

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Куку");
        linkedList.add("Ромашки");
        linkedList.add("Привет");
        linkedList.add("Пока");
        return linkedList;

    }
}
