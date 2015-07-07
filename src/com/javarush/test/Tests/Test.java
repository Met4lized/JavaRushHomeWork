package com.javarush.test.Tests;


import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class Test {
    public static void main(String[] args) {
        Object object = new Object();
        int hCode;
        hCode = object.hashCode();
        System.out.println(hCode);
        String s="ssdf";
        try {
            s.getBytes("cp1251");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println("fail");
        }
    }
}