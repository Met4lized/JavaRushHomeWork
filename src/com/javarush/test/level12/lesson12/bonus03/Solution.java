package com.javarush.test.level12.lesson12.bonus03;

/* Задача по алгоритмам
Написать метод, который возвращает минимальное число в массиве и его позицию (индекс).
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};


        Pair<Integer, Integer> result = getMinimumAndIndex(data);

        System.out.println("Minimum is " + result.x);
        System.out.println("Index of minimum element is " + result.y);
    }

    public static Pair<Integer, Integer> getMinimumAndIndex(int[] array) {
        if (array == null || array.length == 0) {
            return new Pair<Integer, Integer>(null, null);
        }

        //Напишите тут ваше решение
        int min = array[0];  //код здорового человека
        int pos = 0;
        for (int i=0; i<array.length; i++){
            if (min > array[i]){
                min = array[i];
                pos = i;
            }
        }

          /*      ArrayList<Integer> list = new ArrayList<>(); // код курильщика
        for (int i : array) {
            list.add(i);}
        Integer n = 0;
        Arrays.sort(array);
        n = array[0];
        Integer pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (list.get(i).equals(n)) {
                pos = i;
                break;
            }
        }
        return new Pair<Integer, Integer>(array[0], pos); */


        return new Pair<Integer, Integer>(min, pos);
    }

    public static class Pair<X, Y> {
        public X x;
        public Y y;

        public Pair(X x, Y y) {
            this.x = x;
            this.y = y;
        }
    }
}
