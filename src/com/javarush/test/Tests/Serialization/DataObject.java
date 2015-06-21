package com.javarush.test.Tests.Serialization;

import java.io.*;

/**
 * Created by Anton on 21.06.2015.
 */
public class DataObject extends NonSerializable implements Serializable {

    int i = 10;
    String s = "aaa";
    transient String[] def;



    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(getMydata());
        CustomObject castomObject = new CustomObject();

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        in.readObject();

    }

}
