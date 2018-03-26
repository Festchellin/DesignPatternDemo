package com.abstractFactoryPatternDemo;

import com.abstractFactoryPatternDemo.factory.AbstractFactory;
import com.abstractFactoryPatternDemo.product.AirConfditioner;
import com.abstractFactoryPatternDemo.product.Television;
import com.abstractFactoryPatternDemo.utils.XMLUtils;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Client {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, IOException, SAXException, ParserConfigurationException, ClassNotFoundException {
        AbstractFactory factory;
        Television television;
        AirConfditioner airConfditioner;
        factory = (AbstractFactory) XMLUtils.parseXML();

        television = factory.produceTelevision();
        airConfditioner = factory.produceAirConditioner();

        television.play();
        airConfditioner.changeTemperature();
    }
}
