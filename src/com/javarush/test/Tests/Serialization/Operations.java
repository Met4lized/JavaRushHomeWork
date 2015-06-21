package com.javarush.test.Tests.Serialization;

import java.io.*;

/**
 * Created by Anton on 21.06.2015.
 */
public class Operations {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DataObject object = new DataObject();
        File file = new File("store.bin");
        object.setMydata("testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest"); //Не пишется т.к. NonSerializable

        FileOutputStream fo = new FileOutputStream(file);
        ObjectOutputStream so = new ObjectOutputStream(fo);
        so.writeObject(object);
        System.out.println(object.getMydata());
        so.flush();
        so.close();

        FileInputStream fi = new FileInputStream(file);
        ObjectInputStream si = new ObjectInputStream(fi);
        DataObject objectNew = (DataObject)si.readObject();
        si.close();
        System.out.println(objectNew.getMydata());
        System.out.println(object.equals(objectNew));


    }
}
