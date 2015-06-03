package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        //Написать тут ваш код

        ArrayList<Human> family = new ArrayList<Human>();
        ArrayList<Human> kids = new ArrayList<Human>();
        ArrayList<Human> parents = new ArrayList<Human>();

        kids.add(new Human("сын Петя", true, 3, null));
        kids.add(new Human("дочь Катя", true, 4, null));
        kids.add(new Human("сын Вася", true, 5, null));
        parents.add(new Human("папа Андрей", true, 25, kids));
        parents.add(new Human("мама Катя", false, 25, kids));
        family.add(new Human("дед Прокоп", true, 50, parents));
        family.add(new Human("дед Евкакий", true, 50, parents));
        family.add(new Human("баба Зина", false, 50, parents));
        family.add(new Human("баба Варя", false, 50, parents));

        family.addAll(parents);
        family.addAll(kids);

        for (Human item : family)
            System.out.println(item);

    }

    public static class Human {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        List<Human> children;

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
            if (children != null) this.children = children;
            else this.children = new ArrayList<>();

        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
