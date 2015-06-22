package com.javarush.test.Tests;

import java.io.*;

public class Test {
    public static void main(String[] args) {
        String s = "куку";
        String s2 = new String("ку"+"ку");
        String s1 = "куку";
        System.out.println(s.equals(s1));
        System.out.println(s.equals(s2));
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i.equals(j));
        System.out.println(i == j);

    }

}