package com.builderPatternDemo.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class XMLUtils {
    public static Object getBeans() {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document;

//            URL url = XMLUtils.class.getClassLoader().getResource("config.xml");
//            File file = new File(url.getFile());
            File file = new File("src/com/builderPatternDemo/config.xml");
            document = builder.parse(file);
            NodeList nodeList = document.getElementsByTagName("className");
            Node node = nodeList.item(0).getFirstChild();
            String className = node.getNodeValue();
            Class clazz = Class.forName(className);
            Object object = clazz.newInstance();
            return object;
        } catch (IOException | SAXException | ClassNotFoundException | ParserConfigurationException | IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
            return null;
        }
    }
}
