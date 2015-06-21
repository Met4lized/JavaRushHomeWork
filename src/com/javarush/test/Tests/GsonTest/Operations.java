package com.javarush.test.Tests.GsonTest;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Anton on 21.06.2015.
 */
public class Operations {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataObject dataObject = new DataObject();
        Gson gson = new Gson();

        String json = gson.toJson(dataObject);
        FileWriter fileWriter= new FileWriter("gsontest.txt");
        fileWriter.write(json);
        fileWriter.flush();
        fileWriter.close();
        System.out.println(dataObject.getMydata());

        DataObject object = gson.fromJson(json, DataObject.class);
        System.out.println(object.getMydata());

        BufferedReader reader = new BufferedReader(new FileReader("gsontest.txt"));
        String data = reader.readLine();
        DataObject object1 = gson.fromJson(data, DataObject.class);
        System.out.println(object1.getMydata());

    }
}
