package com.javarush.test.Tests.SerializationXML;

import javax.xml.XMLConstants;
import javax.xml.bind.*;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * Created by Anton on 21.06.2015.
 */

@XmlRegistry
public class ObjectFactory {

    private final static QName QNAME = new QName(XMLConstants.NULL_NS_URI, "data");

    @XmlElementDecl(name = "dataObj")
    public JAXBElement<DataObject> createData(DataObject value) {
        return new JAXBElement<DataObject>(QNAME, DataObject.class, null, value);
    }
}
