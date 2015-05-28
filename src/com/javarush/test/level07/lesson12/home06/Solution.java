package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution
{
    public static void main(String[] args)
    {
        //Написать тут ваш код
        Solution.Human babaAnya = new Human("Баба Аня", false, 119, null, null);
        Solution.Human babaKatya = new Human("Баба Катя", false, 119, null, null);
        Solution.Human dedVanya = new Human("Дед Ваня", true, 87, null, null);
        Solution.Human dedPetya = new Human("Дед Петя", true, 87, null, null);
        Solution.Human mamaZina = new Human("Зина", false, 45, babaAnya, dedPetya);
        Solution.Human papaSilvestr = new Human("Силя", true, 48, babaKatya, dedVanya);
        Solution.Human johny = new Human("Джони", true, 19, mamaZina, papaSilvestr);
        Solution.Human aristarhovich = new Human("Аристархович", true, 20, mamaZina, papaSilvestr);
        Solution.Human depp = new Human("Депп", true, 21, mamaZina, papaSilvestr);

        System.out.println(babaAnya);
        System.out.println(babaKatya);
        System.out.println(dedVanya);
        System.out.println(dedPetya);
        System.out.println(mamaZina);
        System.out.println(papaSilvestr);
        System.out.println(johny);
        System.out.println(aristarhovich);
        System.out.println(depp);
    }
    public static class Human
    {
        private String name;
        private boolean sex;
        private int age;
        private Human mother;
        private Human father;

        Human (String name, boolean sex, int age, Human mother, Human father){
            this.name = name;
            this.sex = sex;
            this. age = age;
            this.mother=mother;
            this.father=father;
        }
        //Написать тут ваш код
        public String toString()
        {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;
            return text;
        }
    }
}
