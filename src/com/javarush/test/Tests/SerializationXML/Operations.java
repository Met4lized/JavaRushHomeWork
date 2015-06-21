package com.javarush.test.Tests.SerializationXML;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;

/**
 * Created by Anton on 21.06.2015.
 */
public class Operations {

    static final String PACKAGE = com.javarush.test.Tests.SerializationXML.DataObject.class.getPackage().getName();

    public static void main(String[] args) {
        try {
            com.javarush.test.Tests.Serialization.DataObject object = new com.javarush.test.Tests.Serialization.DataObject();
            File file = new File("store.xml");
            JAXBContext jc = JAXBContext.newInstance(PACKAGE);

            Marshaller m = jc.createMarshaller();
            Unmarshaller um = jc.createUnmarshaller();
            m.marshal(object, file);
            DataObject object1 = (DataObject) um.unmarshal(file);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}