package com.wangkakyi.XML;/*
package XML;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.List;

public class Demo {
    public static void main(String args[]) {
        try{
            SAXReader reader = new SAXReader();
            Document document =reader.read(new File("./src/XML/stus.xml"));
           Element rootElement= document.getRootElement();
//          System.out.println(rootElement.element("stu").element("age").getText());
//             获取根元素下面的所有子元素
//            List<Element> elements =rootElement.elements();
//            遍历所有的stu元素
          */
/*  for (Element e:elements
                 ) {
                System.out.println(e.getName());

            }*//*

            //xpath jar
            Element nameElement = (Element) rootElement.selectSingleNode("//name");
            System.out.println(nameElement.getText());
            List<Node> list =rootElement.selectNodes("//name");
            for (Node e:list
                 ) {
                System.out.println(e.getText());

            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
*/
