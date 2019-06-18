package com.wangkakyi.IO系统.对象流;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Student implements Serializable {
    private String className;
    private Person per;

    public Student(String className, Person per) {
        this.className = className;
        this.per = per;
    }

    public Student() {
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                ", per=" + per +
                '}';
    }

    public Person getPer() {
        return per;
    }

    public void setPer(Person per) {
        this.per = per;
    }
}
public class Demo01 {
    public static void main(String[] args) throws Exception{
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/home/wky/IdeaProjects/Java/src/IO系统/对象流/test.obj"));
        Person s = new Person("孙悟空", 22);
        Student swk = new Student("国学1班", s);
        swk.setClassName("国学重点班");
        oos.writeObject(swk);
        oos.writeObject(swk);
        Person z = new Person("猪八戒", 19);
        Student zbj = new Student("国学2班", z);
        oos.writeObject(zbj);
        oos.close();
    }
}
