package com.javarush.test.level07.lesson04.task05;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Один большой массив и два маленьких
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int [] array= new int[20];
        int [] array1 = new int[array.length/2];
        int [] array2 = new int[array.length/2];

        for (int i=0; i<array.length; i++) {
            array[i]=Integer.parseInt(reader.readLine());
        }
        for (int i=0; i<array1.length; i++){
            array1[i] = array[i];
            array2[i] = array[array.length/2+i];
            System.out.println(array2[i]);
        }
    }
}

