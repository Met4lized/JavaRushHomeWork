package com.javarush.test.Tests.SerializationXML;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Created by Anton on 21.06.2015.
 */


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType

public class CustomObject extends DataObject implements Externalizable {
    boolean b;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
