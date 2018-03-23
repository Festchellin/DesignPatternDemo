package com.FactoryMethodDemo;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException, SAXException, ParserConfigurationException, ClassNotFoundException {
        TVFactory factory;
        TV tv;
        factory = (TVFactory) XMLUtils.parseXML();
        tv = factory.produceTV();
        tv.play();
    }
}
