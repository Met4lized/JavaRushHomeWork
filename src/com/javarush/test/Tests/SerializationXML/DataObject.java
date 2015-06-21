package com.javarush.test.Tests.SerializationXML;

import javax.xml.bind.annotation.*;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Created by Anton on 21.06.2015.
 */


@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "dataObj")

public class DataObject extends NonSerializable implements Serializable {

    @XmlElement
    private int i = 10;

    @XmlAttribute
    private int id = 1;

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        out.writeObject(getMydata());
        com.javarush.test.Tests.Serialization.CustomObject castomObject = new com.javarush.test.Tests.Serialization.CustomObject();

    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        in.readObject();

    }

}

