package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;
import java.util.List;

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код

        Human ded1= new Human("Дед Петя", true, 60, null);
        Human ded2= new Human("Дед Инокентий", true, 59, null);
        Human baba1= new Human("Баба Зина", false, 54, null);
        Human baba2= new Human("Баба Вера", false, 55, null);
        Human mama= new Human("Елена", false, 30, null);
        Human papa= new Human("Иван", true, 34, null);
        Human det1= new Human("Евгений", true, 9, null);
        Human det2= new Human("Катя", false, 7, null);
        Human det3= new Human("Вася", true, 5, null);
        ArrayList<Human> child = new ArrayList<>();
        child.add(mama);
        child.add(papa);
        child.add(det1);
        child.add(det2);
        child.add(det3);
        System.out.println();


    }

    public static class Human
    {
        //Написать тут ваш код
        String name;
        boolean sex;
        int age;
        List<Human> children;



        public Human(String name, boolean sex, int age, ArrayList<Human> children){
           // List<Human> children= new ArrayList<>();
            this.name=name;
            this.sex=sex;
            this.age=age;
            this.children= children;

        }



        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0)
            {
                text += ", дети: "+this.children.get(0).name;

                for (int i = 1; i < childCount; i++)
                {
                    Human child = this.children.get(i);
                    text += ", "+child.name;
                }
            }
            return text;
        }
    }

}
