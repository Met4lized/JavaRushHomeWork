package com.javarush.test.level06.lesson08.task04;

import com.javarush.test.level05.lesson07.task05.Rectangle;

import javax.swing.plaf.ViewportUI;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Класс ConsoleReader
Сделать класс ConsoleReader, у которого будут 4 статических метода:
String readString() – читает с клавиатуры строку
int readInt() – читает с клавиатуры число
double readDouble() – читает с клавиатуры дробное число
void readLn() – ждет нажатия enter [использовать readString()]
*/

public class ConsoleReader
{
    public static String readString() throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        String x = reader.readLine();
        return x ;

        //Напишите тут ваш код

    }

    public static int readInt() throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        int x = new Integer(reader.readLine());
        return x ;//Напишите тут ваш код

    }

    public static double readDouble() throws Exception
    {
        BufferedReader reader = new BufferedReader (new InputStreamReader(System.in));
        double x = new Double(reader.readLine());
        return x ;
        //Напишите тут ваш код

    }

    public static void readLn() throws Exception
    {
        ConsoleReader.readString();

    }
}
