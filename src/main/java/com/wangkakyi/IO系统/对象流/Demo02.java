package com.wangkakyi.IO系统.对象流;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Demo02 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/home/wky/IdeaProjects/Java/src/IO系统/对象流/test.obj"));
        Object first = ois.readObject();
        Student second = (Student) ois.readObject();
        System.out.println(first);
        System.out.println(second);
    }
}
