package com.javarush.test.Tests;

import java.io.*;

public class Test {

    public static class Cat {
        String name;
        int age;
        int weight;


        Cat(String name, int age, int weight){
            this.name=name;
            this.age=age;
            this.weight=weight;
        }

        public void save(OutputStream outputStream) {
            PrintWriter printWriter = new PrintWriter(outputStream);
            printWriter.write(name);
            printWriter.write(age);
            printWriter.write(weight);
        }

        public void load(InputStream inputStream) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
            name = reader.readLine();
            age = Integer.parseInt(reader.readLine());
            weight = Integer.parseInt(reader.readLine());

        }
    }

    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("1.txt");
        InputStream inputStream = new FileInputStream("1.txt");
        Cat cat = new Cat("Burs", 20, 12);
        cat.save(outputStream);
        outputStream.flush();
        cat.load(inputStream);
        outputStream.close();
        inputStream.close();

    }
}